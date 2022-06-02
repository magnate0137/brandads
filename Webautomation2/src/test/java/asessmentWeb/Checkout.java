package asessmentWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


 	
public class Checkout {

	
	WebDriver driver = null;
	
	@BeforeClass
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
	
	}
	
	@Test
	public void Signin ( ) {		
		LandingPage usernameField = new LandingPage(driver) ;
		driver.get("https://www.saucedemo.com/");
		
		usernameField.getUsernameField().sendKeys("standard_user");
		
		 LandingPage passwordField = new LandingPage(driver);
		passwordField.getPasswordField().sendKeys("secret_sauce");
		
		
		 LandingPage submitButton = new LandingPage(driver);
		 submitButton.getSubmitButton().click();
		 
		 addCart sortButton = new addCart(driver);
		 sortButton.getSortbutton().click();
		 
		 addCart valueButton = new addCart(driver);
		 valueButton.Valuebutton().click();
		 
		 addCart  prod1 = new addCart(driver);
		 prod1.Prod1().click();
		 
		 addCart  prod2 = new addCart(driver);
		 prod2.Prod2().click();
		 
		 
		 addCart  cartBe = new addCart(driver);
		 cartBe.Cartbe().click();
		 
		 addCart  checkout23 = new addCart(driver);
		 checkout23.Checkout23().click();
		 
		 
		 
	}
	
	
	
	
	
}
