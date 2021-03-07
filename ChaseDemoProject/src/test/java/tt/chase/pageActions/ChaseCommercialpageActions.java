package tt.chase.pageActions;

import org.openqa.selenium.support.PageFactory;

import tt.chase.pageElements.ChaseCommercialpageLocators;
import tt.utilities.SetupDrivers;

public class ChaseCommercialpageActions {

	ChaseCommercialpageLocators ChaseCommercialpageLocatorsObj;
	
	public ChaseCommercialpageActions(){
		ChaseCommercialpageLocatorsObj = new ChaseCommercialpageLocators();
		PageFactory.initElements(SetupDrivers.driver,  ChaseCommercialpageLocatorsObj);
	}
	public void WatchNow() throws Exception {
		ChaseCommercialpageLocatorsObj.watchNow.click();
		Thread.sleep(3000);
}
	public void Proceed() throws Exception {
		ChaseCommercialpageLocatorsObj.procBtn.click();
		Thread.sleep(3000);
	}
}