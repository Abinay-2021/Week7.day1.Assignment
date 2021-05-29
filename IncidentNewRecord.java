package week7.day1.Assignment.Pages;

import org.openqa.selenium.By;

import week6.day2.TestNgHooks.ServiceNowHooks;

public class IncidentNewRecord extends ServiceNowHooks {
	
	
	public IncidentNewRecord  getIncNumber()
	{
		number = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println(number);
         return this;
	}
	public IncidentNewRecord  giveShortDesc()
	{
		driver.findElement(By.id("incident.short_description")).sendKeys("Test3");
		return this;
	}
	public IncidentServicePage clickOnSubmitButton()
	{
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		return new IncidentServicePage();
	}
	
	public IncidentServicePage deleteIncident()
	{
		driver.findElement(By.id("sysverb_delete")).click();
		driver.findElement(By.id("ok_button")).click();
        return new IncidentServicePage();
	}
	

}