package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayFilterResultLocators {
	//Sleeve Length
		@FindBy(xpath="//body/div[4]/div[4]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/div[2]/ul[1]/li[4]/div[1]/a[1]/div[1]/span[1]/input[1]")
		public WebElement txtFilter;
		//Sleeve Length
		@FindBy(xpath="//h3[text()='Sleeve Length']")
		public WebElement txtSleeveLength;
		
		//Long Sleeve
		@FindBy(xpath="//input[@aria-label='Long Sleeve']")
		public WebElement cbxLongSleeve;
		
		//Long Sleeve
		@FindBy(xpath="//*[contains(text(),'Long Sleeve')]")
		public WebElement txtLongSleeve;
		
		//Brand Nike
		@FindBy(xpath="//*[aria-label='Nike')]")
		public WebElement cbxBrandNike;
		
		//Brand Adidas
		@FindBy(xpath="//*[aria-label='adidas')]")
		public WebElement cbxBrandAdidas;
		
		//Unbranded
		@FindBy(xpath="//*[aria-label='Unbranded')]")
		public WebElement cbxUnbranded;
}