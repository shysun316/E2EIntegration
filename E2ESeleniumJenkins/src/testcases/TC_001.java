package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {
	
	@Test
	public void tc1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElementById("email").sendKeys("Test1");
		driver.findElementById("pass").sendKeys("test@1");
		Thread.sleep(5000);
		driver.quit();
	}

}
