package Dblaze.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Dblaze.AbstractComponents.AbstractComponents;

public class LandingPage extends AbstractComponents {
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
	}
	@FindBy(xpath="(//a[normalize-space()='Log in'])[1]")
	WebElement loginbutton;
	
	@FindBy(xpath="//input[@id='loginusername']")
	WebElement usernameInput;
	@FindBy(xpath="//input[@id='loginpassword']")
	WebElement passwordInput;
	@FindBy(xpath="(//button[normalize-space()='Log in'])[1]")
	WebElement loginbluebutton;
	@FindBy(xpath="//h4[@class='card-title']/a")
	List<WebElement> ListofProducts;
	@FindBy(xpath="//a[normalize-space()='Add to cart']")
WebElement	AddtoCartButton;
	
	public void launchURL()
	{
		driver.get("https://www.demoblaze.com/index.html");
	}
	public void login(String username,String password) throws InterruptedException
	{
		loginbutton.click();
		Thread.sleep(3000);
		usernameInput.sendKeys(username);
		Thread.sleep(3000);
		passwordInput.sendKeys(password);
		Thread.sleep(3000);
		loginbluebutton.click();
		
	}
	public void ProductName(String productName) throws InterruptedException
	{
		for(WebElement products:ListofProducts)
		{
			if(products.getText().equalsIgnoreCase(productName))
			{
				products.click();
				break;
				
			}
		}
		AddtoCartButton.click();
		Thread.sleep(3000);
		AlertAccept(driver);
			
	}

}
