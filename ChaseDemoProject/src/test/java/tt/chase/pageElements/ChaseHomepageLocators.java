package tt.chase.pageElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ChaseHomepageLocators { 
	
	@FindBy(xpath="//button[@id='slick-slide-control05']")
	public WebElement  bubSix;
	
	@FindBy(xpath="//div[@id='slick-slide04']")
	public WebElement SelectHomeLoan;
	
	@FindBy(xpath="//a[contains(text(),'Commercial')]")
	public WebElement commBtn;
	
	@FindBy(xpath="//body")
	public WebElement clkBtn;
}