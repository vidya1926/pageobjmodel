package baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class ProjectSpecficMethod {

	public ChromeDriver driver;
	public String excelfile;
	@BeforeMethod
	public void preConditions() {		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
}
	
	@AfterMethod
	public void postConditons() {
		driver.close();
	}
	
	@DataProvider()
	public String[][] sendData() throws IOException {
		return ReadExcel.readData(excelfile);
}
	
	
}
