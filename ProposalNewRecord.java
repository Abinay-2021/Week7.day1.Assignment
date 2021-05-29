package week7.day1.Assignment.Pages;

import org.openqa.selenium.By;

import week6.day2.TestNgHooks.ServiceNowHooks;

public class ProposalNewRecord extends ServiceNowHooks {

	public ProposalNewRecord getProposal() throws InterruptedException
	
	{
		Thread.sleep(1000);
		proposal=driver.findElement(By.id("std_change_proposal.number")).getAttribute("value");
		return this;
	}
	
	public ProposalNewRecord assignshort(String sdesc)
	{
		driver.findElement(By.id("std_change_proposal.short_description")).sendKeys(sdesc);
		return this;
	}
	public ProposalNewRecord changeReqValue(String crq)
	{
		driver.findElement(By.xpath("//span[text()='Change Request values']")).click();
		driver.findElement(By.xpath("//td[@data-value='Short description']//input[1]")).clear();
		driver.findElement(By.xpath("//td[@data-value='Short description']//input[1]")).sendKeys(crq);
		return this;
		
	}
	public ProposalService clickSubmit()
	{
		driver.findElement(By.id("sysverb_insert")).click();
		return new ProposalService();
	}
}