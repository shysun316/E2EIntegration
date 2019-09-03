package testcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_003 {
	
	@Test
	public void tc1() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElementById("email").sendKeys("Test3");
		driver.findElementById("pass").sendKeys("test@3");
		Thread.sleep(5000);
		driver.quit();
	}

}
