package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();  
		   
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.expedia.com/");
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	        driver.findElement(By.xpath("//input[@id='package-origin-hp-package']")).sendKeys("New");
	        Thread.sleep(3000);
	        
	        driver.findElement(By.id("aria-option-0")).click();
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//input[@id='package-destination-hp-package']")).sendKeys("North Caro");
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//div[@class='display-group-results']/li[2]")).click();
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//input[@id='package-departing-hp-package']")).click();
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//tbody[@class='datepicker-cal-dates']/tr[4]/td[6]")).click();
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//input[@id='package-returning-hp-package']")).click();
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//div[contains(@class,'datepicker-cal')]/div[2]/table[1]/tbody[1]/tr[5]/td[2]/button[1]")).click();
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//div[@id='traveler-selector-hp-package']")).click();
	        Thread.sleep(5000);
	         
	       driver.findElement(By.xpath("//div[@class='menu sticky gcw-menu']/div[1]/div[1]/div[3]/div[1]/div[4]/button/span")).click();
	        Thread.sleep(4000);
	        
	        driver.findElement(By.xpath("//select[@id='package-advanced-preferred-class-hp-package']")).click();
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//select[@id='package-advanced-preferred-class-hp-package']/option[2]")).click();
	        Thread.sleep(3000);
	         
	         
	        
	        
	        

	}

}
