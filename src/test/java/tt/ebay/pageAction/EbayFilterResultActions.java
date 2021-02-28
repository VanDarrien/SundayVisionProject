package tt.ebay.pageAction;

import org.testng.Assert;
import org.openqa.selenium.support.PageFactory;
import tt.utilities.SetupDrivers;
import tt.ebay.pageElements.EbayFilterResultLocators;

public class EbayFilterResultActions {


EbayFilterResultLocators EbayFilterResultLocatorsObj;

public EbayFilterResultActions(){
	EbayFilterResultLocatorsObj = new EbayFilterResultLocators();
	PageFactory.initElements(SetupDrivers.driver, EbayFilterResultLocatorsObj);
}
	public void verifyFilterRelatedProducts(){
		
		// Option:1
		EbayFilterResultLocatorsObj.txtLongSleeve.isDisplayed();
		
		// Option:2
		System.out.println(EbayFilterResultLocatorsObj.txtLongSleeve.getText());
		
		// Option:3
		Assert.assertEquals(EbayFilterResultLocatorsObj.txtLongSleeve.getText(), "Long Sleeve");
		
		//Option:4
		Assert.assertEquals(true, EbayFilterResultLocatorsObj.txtLongSleeve.isDisplayed());
	}
}


