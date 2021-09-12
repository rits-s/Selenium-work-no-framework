package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccountWithoutJunit {
	public static void dropDownSelection(WebElement element, String visibleText) {
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../SeleniumStart/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
		createAccount.click();
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
	// no use of generic method for select dropdown
	/*public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../SeleniumStart/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
		createAccount.click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Abie");
		driver.findElement(By.name("lastname")).sendKeys("Maek");
		driver.findElement(By.name("reg_email__")).sendKeys("0256768336");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Java123");
		
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		//System.out.println("Please enter a value for day");
		//Scanner s = new Scanner(System.in);
		//String data = s.next();
		//s1.selectByVisibleText(data);
		s1.selectByVisibleText("10");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByIndex(1);
		
		WebElement year = driver.findElement(By.id("year"));
		Select s3= new Select(year);
		s3.selectByValue("2000");
		
		WebElement gender = driver.findElement(By.cssSelector("input[value='1']"));
		gender.click();
		
		WebElement signup = driver.findElement(By.cssSelector("button[name='websubmit']"));
		signup.click();		
	}*/
	
}
