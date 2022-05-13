package seleniumpractise;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
           
        screenShot(driver,"C:\\Users\\sk\\eclipse-workspace\\selenium\\src\\google.png");

	}
	
	public static void screenShot(WebDriver driver,String sname) throws IOException
	{
		

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

           

                File DestFile=new File(sname);

               

                FileUtils.copyFile(SrcFile, DestFile);
	}
	
	
	
	

}
