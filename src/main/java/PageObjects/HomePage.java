package PageObjects;

import org.openqa.selenium.By;

public class HomePage extends BaseClass {
	
	public static String acceptCookies="//div[@class=\"cookie-banner-buttons\"]//button[contains(text(),\"Akkoord\")]";
	public static String notAcceptCookies="//div[@class=\"cookie-banner-buttons\"]//button[contains(text(),\"Liever niet\")]";
	public static String exploreTheCollectionLink="//section[@class=\"cta-list\"]//li[@class=\"cta-list-item\"]//a[contains(text(),'Ontdek de collectie')]";
	
	
	
	public static void acceptCookies()
	{
		if(driver.findElement(By.xpath(acceptCookies)).isDisplayed())
		{
			driver.findElement(By.xpath(acceptCookies)).click();
		}
	}
	

	public static void notAcceptCookies()
	{
		if(driver.findElement(By.xpath(notAcceptCookies)).isDisplayed())
		{
			driver.findElement(By.xpath(notAcceptCookies)).click();
		}
	}
	
	public static void clickOnExploreTheCollection()
	{
		driver.findElement(By.xpath(exploreTheCollectionLink)).click();
	}
	
}
