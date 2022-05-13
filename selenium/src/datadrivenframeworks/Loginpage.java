package datadrivenframeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Loginpage  {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	
		driver.get("http://demo.guru99.com/V4");
		
		
		
	}
	@DataProvider()
	public Object[][] getData()
	{
		Object[][] data=login.getTestdata("Sheet1");
		return data;
	}
	@Test(dataProvider="getData")
	public void loginTest(String un,String pwd) 
	{
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).click();
	}
	

}
