package seleniumConcepts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		 
	    WebDriver driver = new ChromeDriver();  
			   
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        FileUtils.moveFile(f,new File("‎⁨Macintosh HD/⁨Users⁩/⁨MANSI⁩/Desktop/MansiScrenshot.png"));
        
        System.out.println(f.isHidden());
        
       
        
	}

}
