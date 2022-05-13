import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=Abhibus_Brand&utm_term=abhibus&utm_content=Brand&gclid=Cj0KCQiA0-6ABhDMARIsAFVdQv_kz8kJ8Ste6TqtQjGCv6gF9b4kY415_BjtWh0uAt3chWgXReCSb1YaAjIBEALw_wcB");
	//driver.get("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=Abhibus_Brand&utm_term=abhibus&utm_content=Brand&gclid=EAIaIQobChMIs5XMtY3S7gIVhw4rCh3-ugNwEAAYASAAEgKQ7PD_BwE");
	    //driver.findElement(By.xpath("//input[@id='source']")).click();
	  //  WebElement  = driver.findElement(By.xpath("(//div[@class='form-group mb-0'])[1]")).click();
	 //   from.sendKeys("vizag");
	}

}
