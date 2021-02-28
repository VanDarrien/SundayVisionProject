package tt.ebay.pageAction;
import org.testng.Assert;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

import tt.utilities.SetupDrivers;

import tt.ebay.pageElements.EbaySearchResultLocators;

public class EbaySearchResultActions {
	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}
		public void verifyShirtRelatedProducts(){
			
			// Option:1
			EbaySearchResultLocatorsObj.txtSleeveLength.isDisplayed();
			
			// Option:2
			System.out.println(EbaySearchResultLocatorsObj.txtSleeveLength.getText());
			
			// Option:3
			Assert.assertEquals(EbaySearchResultLocatorsObj.txtSleeveLength.getText(), "Sleeve Length");
			
			//Option:4
			Assert.assertEquals(true, EbaySearchResultLocatorsObj.txtSleeveLength.isDisplayed());
	}
	
	public void validateLongSleeve(){
		EbaySearchResultLocatorsObj.txtSleeveLength.isDisplayed();
	}
		
	
	public void filterBrand(String Brand) throws Exception{
		Thread.sleep(3000);
		if (Brand.equals("Adidas")){
			EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
		} else if (Brand.equals("Nike")){
			EbaySearchResultLocatorsObj.cbxBrandNike.click();
		} else if (Brand.equals("Unbranded")){	
			EbaySearchResultLocatorsObj.cbxUnbranded.click();
		}
		Thread.sleep(3000);
	}
	public void validateBrand(String Brand) throws Exception{
		TimeUnit time = TimeUnit.SECONDS;
		time.sleep(3);
		if (Brand.equals("Adidas")){
			EbaySearchResultLocatorsObj.txtAdidas.isDisplayed();
		} else if (Brand.equals("Nike")){
			EbaySearchResultLocatorsObj.txtNike.isDisplayed();
		} else if (Brand.equals("Unbranded")){	
			EbaySearchResultLocatorsObj.txtUnbranded.isDisplayed();
		}
		Thread.sleep(3000);
	}
	public void selectItem(){
		EbaySearchResultLocatorsObj.lnkFirstItem.click();
	}
}