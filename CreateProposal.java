package week7.day1.Assignment.Tests;

import org.testng.annotations.Test;

import week6.day2.TestNgHooks.ServiceNowHooks;
import week7.day1.Assignment.Pages.ServiceLoginPage;

public class CreateProposal extends ServiceNowHooks {
	
	@Test
	public void newProposal() throws InterruptedException
	{
		new ServiceLoginPage().typeUName().typePwd().clickLoginButton().filterNavigatorProposal().clickNewButton()
		.getProposal().assignshort("proposal").changeReqValue("This is New Proposal").clickSubmit()
		.verifyProposal();
	}

}
