package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		 
	    WebDriver driver = new ChromeDriver();  
			   
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
	   
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	   Thread.sleep(3000);
	  
	    System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Phoenix Mills')]")).getText());
	   
	   int hegrow = driver.findElements(By.xpath("//a[contains(text(),'Phoenix Mills')]/parent::td/parent::*")).size();
	   System.out.println("size of heggrow:"+hegrow);
	   
	   int hegcolumn = driver.findElements(By.xpath("//a[contains(text(),'Phoenix Mills')]/parent::td/parent::*/child::td")).size();
	   System.out.println("size of hegcolumn:"+hegcolumn);
	   
       int totrows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
	   System.out.println("rows:"+totrows);
	   
	   System.out.println(driver.findElements(By.xpath("//table[@class='dataTable']/tbody/child::tr/child::td")).size());
	   
	    List<WebElement> companynames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/child::tr/child::td[3]"));
      
	      for (WebElement Company: companynames )
	   {
		   System.out.println(Company.getText());
	     }
	       ////table[@class='dataTable']/tbody/tr[i]/td[j]
	      
	      String firstpart = "//table[@class='dataTable']/tbody/tr[";
	      String secondpart = "]/td[";
	      String thirdpart = "]";
	      
	      for(int i=1; i<=totrows; i++)
	      {
	    	  for(int j=1; j<=hegcolumn; j++)
	    	  {
	    		  String finalpart = firstpart+ i +secondpart+ j +thirdpart;
	    		 String data = driver.findElement(By.xpath(finalpart)).getText();
	    		  System.out.print(data+ " | ");
	    	  }
	    	  System.out.println();
	      }
	
	      
	      
	      
	      /*  for(int i=1;i<=companynames.size();i++)
	 {
		 System.out.println(companynames.get(i));
	 }*/
		   
		   
		 
	   
	
	
	
	}

}
