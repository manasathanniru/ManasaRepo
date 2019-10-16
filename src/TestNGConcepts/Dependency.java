package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Dependency {
  
	WebDriver driver;
	
  @BeforeMethod
  public void setup() {
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver");
		 
	     driver = new ChromeDriver();  
			   
   driver.manage().deleteAllCookies();
   driver.manage().window().maximize();
   
   driver.get("https://www.amazon.com");
  
   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }
  @Test
  public void SignInPage() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath(" //input[@id='ap_email']")).sendKeys("reach4satya@gmail.com");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@id='continue']")).click();
      driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Mohan");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
      driver.findElement(By.xpath("//span[@id='nav-your-amazon-text']")).click();
      
  }
   @Test(dependsOnMethods = "SignInPage")
  public void HomePageSearch() throws InterruptedException {
	   
	   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
	   Thread.sleep(3000);
 }
   
  @Test 
  public void search() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Home decor");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
	   Thread.sleep(5000);
	   WebElement d= driver.findElement(By.xpath("//span[contains(text(),'GBtroo Rustic Wall Sconces - Mason Jars Sconce, Ru')]"));
	   d.click();
  }
  
  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
	  
	 
  }

}
