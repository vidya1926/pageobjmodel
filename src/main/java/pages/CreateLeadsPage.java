package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecficMethod;

public class CreateLeadsPage extends ProjectSpecficMethod{

	public CreateLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public CreateLeadsPage enterCname(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		
		return this;
		
	}public CreateLeadsPage enterfname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
		
	}
	
	public CreateLeadsPage enterlname(String lname) {

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
		
	}
	public ViewLeadPage clickCreateLeadbutton() {

		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
		
	}
}
