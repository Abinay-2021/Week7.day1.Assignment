package week7.day1.Assignment.Tests;

import org.testng.annotations.Test;

import week6.day2.TestNgHooks.ServiceNowHooks;
import week7.day1.Assignment.Pages.ServiceLoginPage;

public class CreateIncident extends ServiceNowHooks 

{
	@Test
	public void createIncidentTest() throws InterruptedException {
		new ServiceLoginPage().typeUName().typePwd().clickLoginButton()
		.filterNavigatorIncident().clickNewButton().getIncNumber().giveShortDesc()
		.clickOnSubmitButton().verifyCreatedIncident();

}
}

