package com.selenium.WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupOneAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicholas.obagunle\\eclipse-workspace\\Webautomation\\src\\chromedrivers.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jumia.com.ng/");
		//driver.findElement(By.xpath("//input[@id='fi-q']")).sendKeys("nike airforce 1");
		//driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		//driver.findElement(By.xpath("//body/div[@id='jm']/main[1]/div[2]/div[3]/section[1]/div[1]/article[2]/a[1]/div[2]/h3[1]")).click();
		//driver.findElement(By.xpath("//label[contains(text(),'US 8.5')]")).click();
		//driver.findElement(By.xpath("//div[@class='cont -phl -ptl']//div[1]//form[1]//button[2]//*[local-name()='svg']//*[name()='use' and contains(@href,'https://ww')]")).click();
	
		
		driver.findElement(By.xpath("//input[@id='fi-q']")).sendKeys("samsung galaxy note 20");
        driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
        driver.findElement(By.xpath("//body/div[@id='jm']/main[1]/div[2]/div[3]/section[1]/div[1]/article[48]/a[1]")).click();
        
       
        
	}

}
