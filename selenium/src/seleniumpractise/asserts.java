package seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class asserts {
	
	WebDriver driver;
	@BeforeMethod

	public void spicejet() {
		
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.get("https://www.spicejet.com/");
  
  
	}
	@Test
	public void loginpagetitletest()
	{
	String title=driver.getTitle();
	Assert.assertEquals(title,"SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
	
	}

	@Test
	public void logoTest()
	{
		boolean logo=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/a")).isDisplayed();
		Assert.assertTrue(logo);
	}
}
