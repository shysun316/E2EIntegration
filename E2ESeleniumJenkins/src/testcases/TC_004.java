package testcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_004 {
	
	@Test
	public void tc1() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(10000);
		driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("Test4");
		driver.findElementById("pass").sendKeys("test@4");
		driver.quit();
	}

}
