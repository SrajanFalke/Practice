package com.qa.google.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static WebElement webElement;
	public String browser;
	public String appURL;
	public static Properties property = new Properties(System.getProperties());
	static EventFiringWebDriver listener_driver;


	public void loadProperties() throws FileNotFoundException, IOException {
		property.load(new FileReader("src\\main\\java\\com\\qa\\google\\config\\config.properties"));
		browser = property.getProperty("test_browser");
		appURL = property.getProperty("App_URL");
		System.err.println(appURL);
	}
	public BaseClass(){
		try {
			getDriver();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getDriver() throws FileNotFoundException, IOException {
		loadProperties();
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(appURL);

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.err.println("driver is not initialize");
		}
	}

}
