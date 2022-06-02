package asessmentWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    final WebDriver driver;
	
	public LandingPage (WebDriver UBADRIVER) {
		this.driver = UBADRIVER;		
		PageFactory.initElements(UBADRIVER, this);
	}
	
	@FindBy (xpath = "//input[@id='user-name']") private WebElement usernameField;
	public WebElement getUsernameField() {
		return usernameField;
	}
	
	@FindBy (xpath = "//input[@id='password']") private WebElement passwordField;
	public WebElement getPasswordField() {
		return passwordField;
	}
	
	@FindBy (xpath = "//input[@id='login-button']") private WebElement submitButton;
	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
}
