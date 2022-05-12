package testcases;

import org.testng.annotations.Test;

import baseclass.ProjectSpecficMethod;
import pages.Loginpage;

public class TC001_LoginLogout extends ProjectSpecficMethod{

	
	@Test
	public void runLoginLogout() {
		//System.out.println(driver);
		new Loginpage(driver)		
		.enterUsername().enterPassword().clickLogin().clickLogout();
		
		
		
		
	}
	
	
}
