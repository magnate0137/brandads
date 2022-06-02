package com.selenium.WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorByClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicholas.obagunle\\eclipse-workspace\\Webautomation\\src\\chromedrivers.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.className("ac_input")).sendKeys("short");
       
		
		

	}

}
