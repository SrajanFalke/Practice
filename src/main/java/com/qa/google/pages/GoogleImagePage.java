package com.qa.google.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.google.base.BaseClass;

public class GoogleImagePage extends BaseClass {

	// OR
	@FindBy(xpath = "//a[text()='Images']")
	WebElement image;

	@FindBy(name = "//a[text()='Images']")
	WebElement name;

	public GoogleImagePage() {

		PageFactory.initElements(driver, this);
	}

//	Find logo action
	public void getImagePage() throws FileNotFoundException, IOException, InterruptedException {

		Thread.sleep(1000);
		image.isDisplayed();
		image.click();
		System.out.println("Image page opned");
	}
}
