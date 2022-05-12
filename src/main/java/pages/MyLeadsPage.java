package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecficMethod;

public class MyLeadsPage extends ProjectSpecficMethod{

	public MyLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	
	public MyLeadsPage verifyLeadsPage() {
		System.out.println(driver.getTitle());
		return this;
	}
	
	public CreateLeadsPage clickCreatelead() {
		driver.findElement(By.linkText("Create Lead")).click();
return new CreateLeadsPage(driver);
	}
}
