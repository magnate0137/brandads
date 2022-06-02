package com.selenium.WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorByCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicholas.obagunle\\eclipse-workspace\\Webautomation\\src\\chromedrivers.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.cssSelector("div.header_user_info")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nicholas.obagunle@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Password");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
		
		
	}

}
