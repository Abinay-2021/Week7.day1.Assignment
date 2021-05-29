package week7.day1.Assignment.Tests;

import org.testng.annotations.Test;

import week6.day2.TestNgHooks.ServiceNowHooks;
import week7.day1.Assignment.Pages.ServiceLoginPage;


public class CallerNew extends ServiceNowHooks {
	@Test
	public void callerNew() throws InterruptedException {
		new ServiceLoginPage().typeUName().typePwd().clickLoginButton().filterNavigatorCaller()
		.clickNew().assignFirstName("Abinaya").getfstName().assignLastName("Rajendran").clickSubmit()
		.verifyCallerCreated("Abinaya");
	}

}
