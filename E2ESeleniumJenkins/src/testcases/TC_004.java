package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_004 {
	
	@Test
	public void tc1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(10000);
		driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("Test4");
		driver.findElementById("pass").sendKeys("test@4");
		driver.quit();
	}

}
