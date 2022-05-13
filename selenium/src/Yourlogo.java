import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;


public class Yourlogo {
	public static void main(String args[]) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
         ChromeDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://automationpractice.com/index.php");
         driver.findElement(By.xpath("//*[@class='login']")).click();
         JavascriptExecutor si= (JavascriptExecutor)driver;
    	 si.executeScript("window.scrollBy(0,350)","");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("sateeshma251@gmail.com");
         Thread.sleep(3000);
        
         driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
         Select sc = new Select(driver.findElement(By.id("id_gender1")));
         sc.selectByValue("1");
         
         
         
          }
         }
         	 
         
        
         
         
         
         

	


