package com.qa.google.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;

import com.qa.google.base.BaseClass;

public class HomePage extends BaseClass{

//--------	OR------------------------
	By googleLogo=By.xpath("//img[@class='lnXdpd']");
	By searchText=By.xpath("//input[@name='q']");
	By webdriverText=By.xpath("//b[text()=' webdriver']/parent::span");

	
	//------------	Action-----------------
//	Find logo action
	public void getLogo() throws FileNotFoundException, IOException {
		
		webElement=driver.findElement(googleLogo);
		webElement.isDisplayed();
		System.out.println("Logo found");
	}
//	Search item
	public void searchItem() {
		webElement=driver.findElement(searchText);
		webElement.isDisplayed();
		webElement.click();
		webElement.clear();
		webElement.sendKeys("pdf");
	}
//	Verify webdriver in search results
	public void webDriverItem() {
		webElement=driver.findElement(webdriverText);
		String str=webElement.getText();
		System.out.println(str);
	}
}
