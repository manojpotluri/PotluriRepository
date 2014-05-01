package interview;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWebDriver {
	//delay for 5 minutes
	public long delay = 300000;
	
	public static void main(String[] args) {
		//creating the object
		final TestWebDriver object = new TestWebDriver();	
		//creating a new timer object 
		Timer timer = new Timer();
		//calling the schedule fixed rate method on the timer object
		timer.scheduleAtFixedRate(new TimerTask() {
			//implementing the overridden method from the abstract class.
			@Override
			public void run() {
				try {
					//making a call to my compute difference method
					object.computeDifference();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}	
			
		}, 0, object.delay);	
		
		}
		
	private  void computeDifference() throws InterruptedException {
		// initializing the webDriver	
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/finance?q=vmw");
		WebElement element = driver.findElement(By.id("ref_718288_l"));
		//compute the price from google's website
		double googlePrice = Double.parseDouble(element.getText());
		System.out.println("google Price is " +googlePrice);
		driver.get("http://finance.yahoo.com/");
		//searcing for vmw on yahoo's search bar.
		WebElement element2 = driver.findElement(By.id("mnp-search_box"));
		element2.sendKeys("VMW");
		element2.submit();		
		WebElement element3 = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.id("yfs_l84_vmw")));
		
		//compute yahoo price for VMW
		double yahooPrice = Double.parseDouble(element3.getText());
		System.out.println("Yahoo Price is " +yahooPrice);
		
		if (yahooPrice > googlePrice) {
			System.out.println("Yahoo Price is greater" +yahooPrice);
		}
		else if (googlePrice > yahooPrice) {
			System.out.println("Google's Price is greater" +googlePrice);
		}
		else {
			System.out.println("Price Difference is :" +Math.abs(yahooPrice - googlePrice));
		}
		driver.quit();
		
		}
	
	
}
