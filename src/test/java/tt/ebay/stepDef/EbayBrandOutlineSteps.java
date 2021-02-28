package tt.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbaySearchResultActions;
import tt.ebay.pageAction.EbayHomepageActions;

public class EbayBrandOutlineSteps {

	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	@When("^Search for \"([^\"]*)\"$")
	public void search_by(String item) throws Throwable {
		EbayHomepageActionsObj.searchItem(item);
	}
	

	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		EbaySearchResultActionsObj.filterBrand(brand);
}


	@Then("^Iteam list should have product of \"([^\"]*)\"$")
	public void iteam_list_should_have_product_of(String brand) throws Throwable {
		EbaySearchResultActionsObj.validateBrand(brand);
	
	}
}