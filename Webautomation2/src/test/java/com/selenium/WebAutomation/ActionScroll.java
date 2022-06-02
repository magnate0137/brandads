package com.selenium.WebAutomation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionScroll {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicholas.obagunle\\eclipse-workspace\\Webautomation\\src\\chromedrivers.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver; 
		jsExecutor.executeScript("window.scrollBy(0,900)");

		Thread.sleep(12000);
		
		jsExecutor.executeScript("window.scrollBy(0,-900)");
	}

}
