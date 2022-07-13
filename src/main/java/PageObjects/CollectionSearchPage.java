package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class CollectionSearchPage extends BaseClass{
	
	public static String searchPageHeading="//*[contains(@class,\"collection-page\")]//h1[contains(@class,\"page-header-heading\")]";
	public static String searchTitleField="//form[@class=\"search-field\"]//input[@class=\"search-field-input\"]";
	public static String searchIcon="//button[@type=\"submit\"]//*[@class=\"icon-search\"]";
	public static String searcResultCount="//*[@class=\"collection-art-object-list-results\"]//span[@class=\"results\"]";
	public static String firstResult="//div[contains(@class,\"collection-art-object-list \")]//div[@class=\"collection-art-object-list-item\"][1]";
	
	
	public static String getPageHeading()
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchPageHeading))).getText();
	}
	
	public static void searchTitle(String title) 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchTitleField))).sendKeys(title);
		driver.findElement(By.xpath(searchIcon)).click();
	}
	
	public static String  verifySearchResult()
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searcResultCount))).getText();
	}
	
	public static void clickOnResult()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstResult))).click();
	}
}

