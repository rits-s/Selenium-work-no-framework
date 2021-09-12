package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginWithJunit {
	WebDriver driver;

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "../SeleniumStart/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	@Test
	public void login1() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("Java");
		driver.findElement(By.id("pass")).sendKeys("Auto123");
		driver.findElement(By.name("login")).click();
	}

	@After
	public void closeBrowser() {
		driver.close();
	}
}
