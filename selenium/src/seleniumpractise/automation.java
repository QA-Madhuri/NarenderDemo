package seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class automation {
	WebDriver driver;
	@BeforeMethod

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://practice.automationtesting.in/my-account/");

		driver.findElement(By.id("username")).sendKeys("gvreddy.guddeti@gmail.com");
		driver.findElement(By.id("password")).sendKeys("venkiG@143");
		driver.findElement(By.name("login")).click();
		}
		@Test
		public void shop() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
		driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/ul[1]/li[2]/a[1]/img[1]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"menu-item-244\"]/a")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-251\"]/a")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		Select yr=new Select(driver.findElement(By.name("orderby")));
		yr.selectByIndex(2);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'JavaScript')]")).click();
		}
		@AfterMethod
		public void rewivs() {
		//driver.quit();
		}
		

	}


