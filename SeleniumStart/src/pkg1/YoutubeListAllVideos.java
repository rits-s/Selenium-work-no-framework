package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeListAllVideos {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../SeleniumStart/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

		List <WebElement> all = driver.findElements(By.id("video-title"));
		System.out.println(all.size());
		all.get(2).click();
	}
}
