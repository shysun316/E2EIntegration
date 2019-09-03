package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002 {
	
	@Test
	public void tc2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElementById("email").sendKeys("Test2");
		driver.findElementById("pass").sendKeys("test@2");
		Thread.sleep(5000);
		driver.quit();
	}

}
