package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import tt.ebay.pageElements.EbayFilterLocators;
import tt.utilities.SetupDrivers;

public class EbayFilterActions { 
	
	
EbayFilterLocators EbayFilterLocatorsObj;
	
	public EbayFilterActions(){
		EbayFilterLocatorsObj= new EbayFilterLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayFilterLocatorsObj);
	}
		public void selectFilter(){
		EbayFilterLocatorsObj.txtFilter.click();
		
		}
		
		

}
