package StepDefinitions;

import PageObjects.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;

import org.junit.Assert;

public class SearchFeatureDef extends BaseClass {

	@Given("^User launch browser$")
	public void user_launch_browser() {
	   setDriver();
	}

	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_url(String url) {
	    navigateToURL(url);
	    HomePage.acceptCookies();
	}

	@And("^User clicks on Ontdek de collectie link$")
	public void user_clicks_on_link() {
	   HomePage.clickOnExploreTheCollection();
	}

	@Then("^User should be on Collectie page$")
	public void user_should_be_on_collectie_page() {
	    String heading=CollectionSearchPage.getPageHeading();
	    Assert.assertEquals("Collectie", heading);
	}
	
	
	@When("^User search the painting \"([^\"]*)\"$")
	public void user_search_the_painting(String paintingName) {
	  CollectionSearchPage.searchTitle(paintingName);
	}

	@Then("^User should be on able to see more than \"([^\"]*)\" results$")
	public void user_should_be_on_able_to_see_more_then_results(String expectedCount) {
	  String actualCount=CollectionSearchPage.verifySearchResult();
	 if(Integer.parseInt(actualCount) > Integer.parseInt(expectedCount))
	 {
		Assert.assertTrue(true);
	 }
	 else
	 {
		Assert.fail();
	 } 
	}

	@And("^User click on first result$")
	public void user_click_on_first_result() {
		CollectionSearchPage.clickOnResult();
	}

	@Then("^User should be on able to verify \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_should_be_on_able_to_verify(String F_nummer, String JH_nummer, String Inventarisnummer) {
		HashMap<String,String> map =DetailPage.verifyResultDetail();
		Assert.assertEquals(F_nummer, map.get("F-nummer"));
		Assert.assertEquals(JH_nummer, map.get("JH-nummer"));
		Assert.assertEquals(Inventarisnummer, map.get("Inventarisnummer"));
		closeDriver();
	}
	
}
