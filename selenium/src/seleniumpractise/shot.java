package seleniumpractise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shot {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sk\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.redbus.in/");
//    driver.findElement(By.id("email")).sendKeys("7013433108");
//    driver.findElement(By.id("pass")).sendKeys("naveen@5c3");
//    driver.findElement(By.id("u_0_b")).click();
    Thread.sleep(4000);
    
    
    
    TakesScreenshot src=(TakesScreenshot)driver;
    File srcfile=src.getScreenshotAs(OutputType.FILE);


    File destfile=new File("C:\\\\Users\\\\sk\\\\Desktop\\\\file.png");
    try {
    FileUtils.copyFile(srcfile,destfile);
    } catch (IOException e) {
    
    e.printStackTrace();
    }
    driver.close();

	}

}
