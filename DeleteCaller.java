package week7.day1.Assignment.Tests;

import org.testng.annotations.Test;

import week6.day2.TestNgHooks.ServiceNowHooks;
import week7.day1.Assignment.Pages.ServiceLoginPage;

public class DeleteCaller extends ServiceNowHooks {
	
	@Test
	public void deleteCaller() throws InterruptedException
	{
		new ServiceLoginPage().typeUName().typePwd().clickLoginButton().filterNavigatorCaller()
		.searchByName("Abinaya").clickOnName().deleteCaller();
	}

}
