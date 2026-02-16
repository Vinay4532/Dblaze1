package Dblaze.AbstractComponents;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents {
	WebDriver driver;
	
	public AbstractComponents(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	//wiats
	public void waitForElementToAppear(By FindBy)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(FindBy));
	}
	//Javascrpt executor 
	public void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0.500)");
	}
	public void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0.-500)");
	}
	//windows
	public void windowHandling()
	{
		Set<String> abc = driver.getWindowHandles();
				Iterator<String> it = abc.iterator();
				while(it.hasNext())
				{
					driver.switchTo().window(it.next());
				}
	}
	//alerts
	public void AlertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
}
