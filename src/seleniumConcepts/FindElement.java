package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "chromedriver");
		   
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().deleteAllCookies();
		    
		  driver.get("https://www.amazon.com");
		  
		  driver.manage().window().maximize();
	
		  driver.findElement(By.id("ap_email")).sendKeys("xyz@123.com");
		   
		   driver.findElement(By.name("password")).sendKeys("manasa@123");
		   
		   driver.findElement(By.id("signInSubmit")).click();
		   
		   driver.findElement(By.linkText("remember_me_learn_more_link")).click();
		   
		   driver.findElement(By.partialLinkText("Help"));
		   
		   driver.close();
		   
		   
		   
		   
		   
		   
		   
		   
	}

}
