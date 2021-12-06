package com.qa.google.pages;

import org.openqa.selenium.By;

import com.qa.google.base.BaseClass;

public class FbLoginPage extends BaseClass{
//Locator
	By loginPrompt=By.xpath("//div[@class='_3wFoIb row']");
	By loginButton=By.xpath("//a[@class='_1_3w1N']");
	By emailid=By.xpath("//input[@class='_2IX_2- VJZDxU']");
	By password=By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']");
	By loginButton1=By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	
//	Action 
	public void loginPrompt() {
		webElement=driver.findElement(loginPrompt);
		webElement.isDisplayed();
	}	
public void addEmailId(String userName) {
	webElement=driver.findElement(emailid);
	webElement.sendKeys(userName);
}	
public void addPassword(String password1) {
	webElement=driver.findElement(password);
	webElement.sendKeys(password1);
}	
public void clickOnBtn() {
	webElement=driver.findElement(loginButton1);
	webElement.click();
}	
}
