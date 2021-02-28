package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayFilterLocators {
	
	//@FindBy(xpath="//span[@class='cbx x-refine_multi-select-cbx']")
    //@FindBy(xpath="//input[@aria-label='Long Sleeve'] and [@type='checkbox']")
  
@FindBy(xpath="//body/div[4]/div[4]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/div[2]/ul[1]/li[4]/div[1]/a[1]/div[1]/span[1]/input[1]")

	public WebElement txtFilter;

}
