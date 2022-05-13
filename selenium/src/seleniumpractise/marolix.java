package seleniumpractise;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class marolix {

	WebDriver driver;

	@BeforeMethod
	public void setUp()
	{


		System.setProperty("webdriver.chrome.driver","C:\\Users\\sk\\Desktop\\geckodriver.exe");
		 driver=new FirefoxDriver();

	driver.get("https://www.marolix.com");

	}
	@Test
	public void Home() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Services')]"))).build().perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Web Design & Development')])[1]")).click();
	
	
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	WebElement ele=driver.findElement(By.xpath("//body/div[1]/section[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]"));
	jse.executeScript("arguments[0].scrollIntoView(true);",ele);
	
	
	driver.findElement(By.xpath("//body/div[1]/section[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]")).click();
	
	
	
	}
	
	@Test
	public void contact()
	{
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contact')]"))).build().perform();
		//driver.findElement(By.xpath("(//a[contains(text(),'Web Design & Development')])[1]")).click();
	
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement elem=driver.findElement(By.xpath("(//a[contains(text(),'Graphic Designing')])[2]"));
		jse.executeScript("arguments[0].scrollIntoView(true);",elem);
		
		
		driver.findElement(By.xpath("(//a[contains(text(),'Graphic Designing')])[2]")).click();
		
	
	
	
	}
	@Test
	public void home1() {
		WebElement digi=driver.findElement(By.xpath("//body/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",digi);
		driver.findElement(By.xpath("//body/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]")).click();
		
	}
	@Test
	public void portfolio() {
		driver.findElement(By.xpath("//a[contains(text(),'Portfolio')]")).click();
		WebElement port=driver.findElement(By.xpath("//a[contains(text(),'Graphic Solutions')]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",port);
		driver.findElement(By.xpath("//a[contains(text(),'Graphic Solutions')]")).click();
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


