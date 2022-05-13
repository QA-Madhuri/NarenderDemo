import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {
	public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://s1.demo.opensourcecms.com/s/44");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("sateeshma251@gmail.com");
	}
}
