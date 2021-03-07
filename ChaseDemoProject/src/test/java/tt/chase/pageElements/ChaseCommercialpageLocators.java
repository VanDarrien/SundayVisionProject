package tt.chase.pageElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChaseCommercialpageLocators {
//	@FindBy(xpath="//*[contains(text(),'Watch')]")
//	public WebElement watchNow;
	
	@FindBy(xpath="//a[contains(text(),'Proceed')]")  
	public WebElement procBtn;
	
	@FindBy(xpath="//a[contains(text(),'Watch now')]")
	public WebElement watchNow;
	
	public class ScrollByVisibleElement {

	    WebDriver driver;
	    @Test
	    public void ByVisibleElement() {
	        System.setProperty("webdriver.chrome.driver", "C://Program Files/Chrome.driver/chromedriver.exe");
	        driver = new ChromeDriver();
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        //Find element by link text and store in variable "Element"        		
	        WebElement watchNow = driver.findElement(By.linkText("Watch Now"));

	        //This will scroll the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", watchNow);
	    }
	    
	}
	
}
