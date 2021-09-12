package pkg1;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FacebookActionClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../SeleniumStart/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		for(int i=0;i<5;i++) {
			a.sendKeys(Keys.TAB);
		}
		a.sendKeys(Keys.ENTER).perform();
	}
}
