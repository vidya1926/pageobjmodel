package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectSpecficMethod;
import pages.Loginpage;

public class TC002_CreateLead extends ProjectSpecficMethod{

	@BeforeTest
	public void setData() {
		excelfile="CreateLead";
	}
	
	@Test(dataProvider="sendData")
	public void runcreateLead(String cname,String fname,String lname) {
		
		new Loginpage(driver)		
		.enterUsername().enterPassword().clickLogin()
		.clickCrmSfa().verifyHomePage().LeadLink()
		.clickCreatelead().enterCname(cname).enterfname(fname).enterlname(lname)
		.clickCreateLeadbutton()
		.verifyLead();
		
		
		
	}
	
	
}
