package tt.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomepageActions;
import tt.ebay.pageAction.EbayFilterActions;
import tt.ebay.pageAction.EbayFilterResultActions;

public class EbayFilterSearchSteps {


	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
	EbayFilterActions EbayFilterActionsObj = new EbayFilterActions();
    EbayFilterResultActions EbayFilterResultActionsObj = new EbayFilterResultActions();
@When("^Select Long Sleeve filter$")
public void select_Long_Sleeve_filter() throws Throwable {
   System.out.println("Select Long Sleeve filter");
   EbayFilterActionsObj.selectFilter();
}

@Then("^The item list should only have Long Sleeve shirts$")
public void the_item_list_should_only_have_Long_Sleeve_shirts() throws Throwable {
   System.out.println("The item list should only have Long Sleeve shirts");
   EbayFilterResultActionsObj.verifyFilterRelatedProducts(); 
   }
}