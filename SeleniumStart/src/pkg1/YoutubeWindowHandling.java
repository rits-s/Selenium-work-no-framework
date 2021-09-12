package pkg1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YoutubeWindowHandling {
	
	  /*WebDriver driver;
	  
	  @Before 
	  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver",
	  "../SeleniumStart/chromedriver.exe"); driver = new ChromeDriver();
	  driver.get("https://www.youtube.com/"); driver.manage().window().maximize();
	  }
	  
	  @Test 
	  public void windowHandling() throws InterruptedException { 
		  WebElement video = driver.findElement(By.xpath("//*[@id='video-title']"));
		  Actions a = new Actions(driver); Thread.sleep(5000);
		  a.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
		  
		  String currentWindow = driver.getWindowHandle(); 
		  Set<String> allWindows = driver.getWindowHandles(); 
		  System.out.println("Before loop url is " + driver.getCurrentUrl()); 
		  for (String s : allWindows) {
			  driver.switchTo().window(s); 
			  System.out.println("All windows" + s); 
		  }
		  System.out.println("After loop url is " + driver.getCurrentUrl());
		  driver.switchTo().window(currentWindow);
		  System.out.println("In the end the url is " + driver.getCurrentUrl()); 
	  }
	  
	  @After 
	  public void closeBrowser() { 
	  	driver.close(); 
	  }
	  */
	 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../SeleniumStart/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
				
		WebElement video = driver.findElement(By.xpath("//*[@id='video-title']"));
		Actions a = new Actions(driver);
		//for(int i=0;i<5;i++) {    //use loop if want to hit 4 tabs at once
		a.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
		//}
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("Before loop url is " + driver.getCurrentUrl());
		for (String s : allWindows) {
			driver.switchTo().window(s);
		}

		System.out.println("After loop url is " + driver.getCurrentUrl());
		driver.switchTo().window(parentWindow);
		System.out.println("In the end the url is " + driver.getCurrentUrl());
		// driver.quit(); // closes all tabs
		// driver.close(); // close the parent window

	}
}
