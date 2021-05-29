package week7.day1.Assignment.Tests;

import org.testng.annotations.Test;
import week6.day2.TestNgHooks.ServiceNowHooks;
import week7.day1.Assignment.Pages.ServiceLoginPage;

public class DeleteIncident extends ServiceNowHooks {
	
	@Test
	public void delteIncident()throws InterruptedException 
	{
		new ServiceLoginPage().typeUName().typePwd().clickLoginButton().filterNavigatorIncident().searchById("INC0010255")
		.clickOnIncident().deleteIncident().verifyDeleteIncident();
	}

}
