package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecficMethod;

public class MyHomePage extends ProjectSpecficMethod{

	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public MyHomePage verifyHomePage() {
		System.out.println(driver.getTitle());
		return this;
	}
	
	public MyLeadsPage LeadLink() {
		driver.findElement(By.linkText("Leads")).click();
	return new MyLeadsPage(driver);
	}
	
	
}
