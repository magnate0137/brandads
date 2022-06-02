package asessmentWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addCart {
	
	
	
final WebDriver driver;
	
	public addCart (WebDriver UBADRIVER) {
		this.driver = UBADRIVER;		
		PageFactory.initElements(UBADRIVER, this);
	}
	
	@FindBy (xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]") private WebElement sortButton;
	public WebElement getSortbutton() {
		return sortButton;
	}
	
	@FindBy (xpath = "//option[contains(text(),'Price (low to high)')]") private WebElement valueButton;
	public WebElement Valuebutton() {
		return valueButton;
	}
	
	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement prod1;
	public WebElement Prod1() {
		return prod1;
	}
	
	
	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement prod2;
	public WebElement Prod2() {
		return prod2;
	}
	

	@FindBy (xpath = "//a[@class='shopping_cart_link']") private WebElement cartBe;
	public WebElement Cartbe() {
		return cartBe;
	}
	
	@FindBy (id = "checkout") private WebElement checkout23;
	public WebElement Checkout23() {
		return checkout23;
	}
}
