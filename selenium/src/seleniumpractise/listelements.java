package seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class listelements {


		
		WebDriver driver;
	    @Test
	    public void setup()  { 
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		 
		
    
	Actions action = new Actions(driver);
		// Thread.sleep(3000);;
		// action.sendKeys(Keys.ESCAPE).build().perform();
		//
		// WebElement elementToClick=driver.findElement(By.name("q"));
		//
		// elementToClick.sendKeys("mobiles");
		// elementToClick.sendKeys(Keys.ENTER);
		//
		// Actions sendpagedown=action.sendKeys(Keys.PAGE_DOWN);
		//
		// sendpagedown.build().perform();
		//
	List<WebElement> list=driver.findElements(By.tagName("a"));

	System.out.println(list.size());

	for(int i=0;i<list.size();i++)
	{

	System.out.println(list.get(i).getAttribute("href"));
	}

	}
	
	}


