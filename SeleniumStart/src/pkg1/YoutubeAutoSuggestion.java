package pkg1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		try {
			System.setProperty("webdriver.chrome.driver", "../SeleniumStart/chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();

			WebElement s = driver.findElement(By.xpath("//*[@id ='search']"));
			s.click();
			s.sendKeys("ice");
			Thread.sleep(3000);

			List<WebElement> all = driver.findElements(By.className("sbsb_b"));
			for (WebElement w : all) { // all list elements in 'all' are stored one by one in 'w'
				// System.out.println(w.getText());
				// Thread.sleep(4000);
				if (w.getText().equalsIgnoreCase("iceland volcano eruption 2021")) {
					w.click();
					break;				
				}
			}
			//Thread.sleep(5000);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
