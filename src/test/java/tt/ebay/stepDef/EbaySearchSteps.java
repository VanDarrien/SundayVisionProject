package tt.ebay.stepDef;
import tt.ebay.pageAction.EbayHomepageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EbaySearchSteps {
	
	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();

	
	@Given("^Open Ebay website$")
	public void open_Ebay_website() throws Throwable {
		System.out.println("Open Ebay Website");
		EbayHomepageActionsObj.loadEbayHomepage();
	}

	@When("^Search for shirts$")
	public void in_searchbar_type_in_shirts() throws Throwable {
		System.out.println("Search for shirts");
		EbayHomepageActionsObj.searchShirt();
	}

	
	@Then("^Item list should only have shirt related products$")
	public void item_list_should_have_only_shirt_related_products() throws Throwable {
		System.out.println("Item list should have only shirt related products");
		EbaySearchResultActionsObj.verifyShirtRelatedProducts();
	}
}