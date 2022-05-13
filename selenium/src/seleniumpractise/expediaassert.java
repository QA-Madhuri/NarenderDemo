package seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class expediaassert {
 
	
	
    WebDriver driver;
	@BeforeMethod


	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.expedia.com/");
		  
	

	}
	
	
	@Test
	public void loginpagetitletest()
	{
	String title=driver.getTitle();
	Assert.assertEquals(title,"Expedia Travel: Vacation Homes, Hotels, Car Rentals, Flights & More");
 
	}
	@Test
	public void logoTest()
	{
		boolean logo=driver.findElement(By.xpath("//*[@id=\"app-layer-base\"]/div[2]/header/section/div/div/a/img")).isDisplayed();
		Assert.assertTrue(logo);
}
}
