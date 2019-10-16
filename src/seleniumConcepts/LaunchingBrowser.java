package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class LaunchingBrowser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		 
		    WebDriver driver = new ChromeDriver();  
				   
	        driver.manage().deleteAllCookies();
		   
		   driver.get("https://www.google.com");
		   
		   driver.manage().window().maximize();
		   
		   driver.navigate().to("https://www.ebay.com");
		   
		   driver.navigate().back();
		   
		   driver.navigate().forward();
		   
		   driver.close();
		   
	
	
	
	
	
	}
	
	
	
	
	
	

}
