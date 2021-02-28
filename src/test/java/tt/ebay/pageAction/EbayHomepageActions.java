package tt.ebay.pageAction;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;

import tt.ebay.pageElements.EbayHomepageLocators;
import tt.utilities.SetupDrivers;

public class EbayHomepageActions {
	
	EbayHomepageLocators EbayHomepageLocatorsObj;

	public EbayHomepageActions(){
		EbayHomepageLocatorsObj = new EbayHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver,  EbayHomepageLocatorsObj);
	}
	
	public void loadEbayHomepage() throws Exception {
//		SetupDrivers.driver.get("https://www.ebay.com");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void searchShirt() throws Exception {
		EbayHomepageLocatorsObj.txtbxSearchForAnything.clear();
		EbayHomepageLocatorsObj.txtbxSearchForAnything.sendKeys("shirts");
		EbayHomepageLocatorsObj.btnSearch.click();
		Thread.sleep(3000);
		
	}
	public void searchItem(String item) throws Exception {
		EbayHomepageLocatorsObj.txtbxSearchForAnything.clear();
		EbayHomepageLocatorsObj.txtbxSearchForAnything.sendKeys(item);
		EbayHomepageLocatorsObj.btnSearch.click();
		Thread.sleep(3000);
		
	}
}