package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecficMethod;

public class ViewLeadPage extends ProjectSpecficMethod {
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public ViewLeadPage verifyLead() {
		System.out.println(driver.getTitle()); 
		return this;
	}

}
