package seleniumpractise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooscreenshot {
			 static WebDriver driver;
			public static void main(String[] args) throws IOException {
				
				
				   
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://in.yahoo.com/");
			 Screenshot("yahoo_login");
					 }
					 
			public static void Screenshot(String filename) throws IOException {
			   File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(file, new File("C:\\Users\\sk\\eclipse-workspace\\selenium\\src"+filename+".jpg"));
						  
			  }
					
					  
					  
			

	}


