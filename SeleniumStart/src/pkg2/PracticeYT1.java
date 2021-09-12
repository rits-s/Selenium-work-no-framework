package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PracticeYT1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../SeleniumStart/chromedriver.exe");
		
		//to open in incognito mode
		/*DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);*/
				
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//*[text()= 'Sign in']")).click();
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("teggy.gy@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("qqqq123");		
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		
		/*String s="sony";
		
		char n =0;
		for (int i=0; i<s.length()-1;i--){
			n= s.charAt(i);
		}
		System.out.println(n);*/

	}
	
	
}
