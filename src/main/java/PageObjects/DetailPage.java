package PageObjects;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DetailPage extends BaseClass {

	public static String item="//div[@class=\"definition-list-item\"]";
	public static String itemLabel="definition-list-item-label";
	public static String itemValue="definition-list-item-value";
	public static String plusIconOfObjectData="//div[@class=\"accordion-item-button-icon\"]//parent::button[contains(@aria-label,\"Objectgegevens\")]";
	
	public static HashMap<String,String> verifyResultDetail()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(plusIconOfObjectData))).sendKeys(Keys.ENTER);
		HashMap<String,String> map= new HashMap<String,String>();
		List<WebElement> elements = driver.findElements(By.xpath(item));
		for(WebElement elm:elements)
		{
			map.put(elm.findElement(By.className(itemLabel)).getText(), elm.findElement(By.className(itemValue)).getText());
		}
		return map;
	}
	

}
