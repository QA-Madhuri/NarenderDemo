import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sleasy {
          public static void main(String args[]) throws InterruptedException {
        	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
              ChromeDriver driver = new ChromeDriver();	
              driver.manage().window().maximize();
              driver.get("https://www.seleniumeasy.com/");
              Thread.sleep(3000);
              driver.findElement(By.xpath("(//*[@class='btn btn-success'])[1]")).click();
              Thread.sleep(2000);
              driver.findElement(By.id("at-cv-lightbox-close")).click();
              JavascriptExecutor si= (JavascriptExecutor)driver;
         	  si.executeScript("window.scrollBy(0,650)","");
              Thread.sleep(3000);
              driver.findElement(By.xpath("(//*[@class='btn btn-success btn-outline-rounded green'])[1]")).click();
              Thread.sleep(2000);
              driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(3) div.row div.col-md-6.text-left:nth-child(2) div.row div.board div.tab-content div.tab-pane.fade.active.in:nth-child(2) div.list-group:nth-child(4) > a.list-group-item:nth-child(1)")).click();
              Thread.sleep(2000);
              driver.findElement(By.xpath("(//*[@id='user-message'])[1]")).sendKeys("hi my name is sateesh kumar pinninti");
              Thread.sleep(2000);
              driver.findElement(By.xpath("(//*[@type='button'])[2]")).click();
              Thread.sleep(2000);
              driver.findElement(By.id("sum1")).sendKeys("78");
              driver.findElement(By.id("sum2")).sendKeys("50");
              driver.findElement(By.xpath("(//*[@class='btn btn-default'])[2]")).click();
              Thread.sleep(2000);
              driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(3) div.row div.col-md-6.text-left:nth-child(2) div.row div.board div.tab-content div.tab-pane.fade.active.in:nth-child(2) div.list-group:nth-child(4) > a.list-group-item:nth-child(3)")).click();
              
     }       
}

