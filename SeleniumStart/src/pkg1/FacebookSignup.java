package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../SeleniumStart/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		// driver.manage().window().maximize();
		Options op = driver.manage();
		Window w = op.window();
		w.maximize();
		WebElement user = driver.findElement(By.id("email"));
		// WebElement user = driver.findElement(By.cssSelector("input[data-testid='royal_email']"));
		user.sendKeys("Automation");
		WebElement password = driver.findElement(By.cssSelector("input#pass"));
		password.sendKeys("password1");
		WebElement login = driver.findElement(By.name("login"));
		login.click();

		/*WebElement createAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
		createAccount.click();
		 */
	}
}

