package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
  
	  
  @BeforeMethod
  public void setup() {
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver");
		 
	     driver = new ChromeDriver();  
			   
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      
      driver.get("https://www.google.com");
     
      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
  @Test
  public void pagetitle() {
	 
	  String title = driver.getTitle();
	  System.out.println(title);
  }  
  @Test
  public void Gmail() {
	  
	  boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	  System.out.println(b);
  }  
  @AfterMethod
  public void close() {
	  
	  driver.close();
  }

}
