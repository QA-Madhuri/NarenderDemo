import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB1234 {
	public static void main(String args[]) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Raghuvaran");
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Racks");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("9398107345");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("Sateesh@123");
       Thread.sleep(2000);
       Select sc=new Select(driver.findElement(By.xpath("//*[@id='day']")));
       sc.selectByVisibleText("9");
       Thread.sleep(2000); 
       Select vc=new Select(driver.findElement(By.xpath("//*[@id='month']")));
       vc.selectByValue("8");
       Thread.sleep(2000);
       Select bc=new Select(driver.findElement(By.xpath("//*[@id='year']")));
       bc.selectByValue("1993");
       Thread.sleep(2000);
       WebElement male=driver.findElement(By.xpath("(//*[@class='_58mt'])[2]"));
       male.click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
       Thread.sleep(3000);
       TakesScreenshot src=(TakesScreenshot)driver;
	   File srcfile=src.getScreenshotAs(OutputType.FILE);
	   File destfile=new File("D:\\sateesh.png");
	   FileUtils.copyFile(srcfile, destfile);  
       driver.close();
	}
		
	}


