package week7.day1.Assignment.Pages;

import org.openqa.selenium.By;

import week6.day2.TestNgHooks.ServiceNowHooks;

public class ServiceLoginPage extends ServiceNowHooks {
	
	public ServiceLoginPage typeUName() {
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		return this;
	}

	public ServiceLoginPage typePwd() {
		driver.findElement(By.id("user_password")).sendKeys("India@123");
		return this;
	}

	public ServiceHomePage clickLoginButton() {
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		return new ServiceHomePage();
	}

}
