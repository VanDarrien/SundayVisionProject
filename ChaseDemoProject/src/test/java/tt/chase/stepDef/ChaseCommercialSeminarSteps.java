package tt.chase.stepDef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.chase.pageActions.ChaseHomepageActions;
import tt.chase.pageActions.ChaseCommercialpageActions;


public class ChaseCommercialSeminarSteps {
	
	ChaseHomepageActions ChaseHomepageActionsObj = new ChaseHomepageActions();
	ChaseCommercialpageActions ChaseCommercialpageActionsObj = new ChaseCommercialpageActions();

	
@Given("^open Chase website$")
public void open_Chase_website() throws Throwable {
	System.out.println("open Chase website");
	ChaseHomepageActionsObj.loadChaseHomepage();
}
@Given("^click commercial$")
public void click_commercial() throws Throwable {
    System.out.println("click commercial");
    ChaseHomepageActionsObj.SelectCommercial();
}
    @Given("^click watch now$")
    public void click_watch_now() throws Throwable {
    	System.out.println("click watch now");
    	ChaseCommercialpageActionsObj.WatchNow();    
}
    @Given("^click proceed$")
    public void click_proceed() throws Throwable {
    	System.out.println("click proceed");
    	ChaseCommercialpageActionsObj.Proceed();    
}
}
