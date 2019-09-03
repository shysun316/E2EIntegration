package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {
	
	@Test
	public void tc1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(10000);
		driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("Test3");
		driver.findElementById("pass").sendKeys("test@3");
		driver.quit();
	}

}
