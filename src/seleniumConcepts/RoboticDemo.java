package seleniumConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboticDemo {

	public static void main(String[] args) throws AWTException  {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		 
	    WebDriver driver = new ChromeDriver();  
			   
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        
        driver.get("http://tinyupload.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	     Robot robot= new Robot();
	    
	     driver.findElement(By.xpath("input[@name='uploaded_file']")).click();
	  
	      robot.setAutoDelay(5000);
	     
	    StringSelection ss = new StringSelection("Users⁩/⁨MANSI⁩/Downloads⁩/⁨QA documents⁩/Test Cases.xlsx");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	     
	     robot.setAutoDelay(2000);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.setAutoDelay(3000);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	  
	     
	     
	     
	  
	     
	     
	
	}

}
