package seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abhibus {


		
		private static final String datevalue = null;

		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk\\Desktop\\chromedriver_win32\\ chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		//to select leaving from
		WebElement source =driver.findElement(By.xpath("//*[@id='source']"));
		source.clear();
		source.sendKeys("Tenal");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		//to select destination
		WebElement destination =driver.findElement(By.xpath("//*[@id='destination']"));
		destination.clear();
		destination.sendKeys("Hyderaba");
		Thread.sleep(2000);
		destination.sendKeys(Keys.ENTER);


		WebElement element = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		String journeydate="23-12-2020";
		selectJourney(driver,element,journeydate);

		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"datepicker2\"]"));
		String returndate="02-1-2021";
		selectRJourney(driver,element1,returndate);
		//to click search button
		driver.findElement(By.xpath("//*[@id=\"roundTrip\"]/a")).click();
		}
		public static void selectRJourney(WebDriver driver, WebElement element1, String returndate) {
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].setAttribute('value','"+returndate+"');", element1);
		// TODO Auto-generated method stub

		}
		public static void selectJourney(WebDriver driver,WebElement element,String journeydate) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+journeydate+"');",element);


		}
		}
	
