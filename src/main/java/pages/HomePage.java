package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecficMethod;

public class HomePage extends ProjectSpecficMethod{
	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}

	public MyHomePage clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
		
	}	
	public Loginpage clickLogout() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new Loginpage(driver);
	}
	
		
	
}
