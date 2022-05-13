import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
	public static void main(String argd[]) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
	  /* driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("9398107345");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Sateesh@123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();*/
	
	}

}
