package seleniumpractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class flipkart {
   WebDriver driver;
@BeforeMethod

	public void Setup() {

				System.setProperty("webdriver.chrome.driver","C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.get("https://www.flipkart.com/");
				
				
				
				
  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7013433108");
  driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")).sendKeys("naveen@143");
  driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/button[1]")).click();
	}
			@Test
			public void search() {
			WebElement lp=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
				
			lp.sendKeys("laptop");
	
			try {
            	    lp.sendKeys(Keys.ENTER);
			  }catch(StaleElementReferenceException e){
				  
			  }
			    
		WebElement img=driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]"));
		    if(img.isDisplayed())
	   {
		    	System.out.println("Test Passed");
	    }else {
	    	System.out.println("Test Failed");
		    }

}
		    
             @AfterMethod
		   public void teardown() 
             {		  
            	 driver.quit();


			
				
			     //driver.close();
				//driver.navigate().back();
				


	   }

	}


