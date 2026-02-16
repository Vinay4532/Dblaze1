package Dblaze.SubmitOrderTest;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import Dblaze.PageObjects.LandingPage;
import Dblaze.TestComponents.BaseTest;

public class SubmitOrderTest extends BaseTest {
	
	@Test
	public void submitOrderTest() throws IOException, InterruptedException
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		LandingPage page = new LandingPage(driver);
		page.launchURL();
		Thread.sleep(3000);
		page.login("pavanol","test@123");
		Thread.sleep(3000);
		page.ProductName("Samsung galaxy s6");
		Thread.sleep(4000);
	}

}
