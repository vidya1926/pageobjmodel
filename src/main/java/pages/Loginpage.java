package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecficMethod;

public class Loginpage extends ProjectSpecficMethod {
	
	public Loginpage(ChromeDriver driver) {
		this.driver=driver;
	}	

	public Loginpage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		/*
		 * Loginpage lp=new Loginpage(); return lp;
		 */
		return this;	}

	public Loginpage enterPassword() {
	
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}

	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		/*
		 * HomePage hp= new HomePage(); return hp;
		 */

		return new HomePage(driver);
	}

}
