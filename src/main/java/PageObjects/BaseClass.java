package PageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String logoIcon="//*[@class=\"main-navigation\"]//a[@class=\"main-navigation-desktop-logo\"]";
	
	
	public static void setDriver()
	{
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	public static void navigateToURL(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(logoIcon)));
	}
	
	public static void closeDriver()
	{
		driver.quit();
	}
	
}
