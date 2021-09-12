package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccountWithJunitAnnotations {
	WebDriver driver;

	@Before
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "../SeleniumStart/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	public void dropDownSelection(WebElement element, String visibleText) {
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);
	}

	@Test
	public void signUpFB() throws InterruptedException {

		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Mabei");
		driver.findElement(By.name("lastname")).sendKeys("Arae");
		driver.findElement(By.name("reg_email__")).sendKeys("0256762275");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Java123");

		WebElement day = driver.findElement(By.id("day"));
		dropDownSelection(day, "10");
		WebElement month = driver.findElement(By.id("month"));
		dropDownSelection(month, "Feb");
		WebElement year = driver.findElement(By.id("year"));
		dropDownSelection(year, "2000");

		driver.findElement(By.cssSelector("input[value='1']")).click();
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
	}

	@After
	public void browserClose() {
		driver.close();
	}
}
