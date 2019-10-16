package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
 

public class GetWindowMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		   
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https.//www.google.com");
		   
		   driver.manage().deleteAllCookies();
		  
		   driver.manage().window().maximize();
		   
		   System.out.println(driver.getCurrentUrl());
		   
		   Thread.sleep(3000);
		   
		   System.out.println(driver.getPageSource());
		   
		   Thread.sleep(3000);
		   
		   System.out.println(driver.getTitle());
		   
		   Thread.sleep(3000);
		   
		   System.out.println(driver.getWindowHandle());
		   
		   Thread.sleep(3000);
		   
		   driver.manage().window().fullscreen();
		   
		   Thread.sleep(3000);
		  
		   driver.close();
		   
		
		
		
		
		
	}

}
