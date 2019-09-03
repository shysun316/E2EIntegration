package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {
	
	@Test
	public void tc1()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("Test3");
		driver.findElementById("pass").sendKeys("test@3");
		driver.quit();
	}

}
