import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	public static void main(String args[]) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://myqshops.com/UserManagement/CustomerRegistration");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Register Seller Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("sateesh kumar");
        driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("pinninti");
        driver.findElement(By.xpath("//*[@id='EmailId']")).sendKeys("sateeshma251@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='PWord']")).sendKeys("Sateesh@123");
        driver.findElement(By.xpath("//*[@name='CnfPWord'] ")).sendKeys("Sateesh@123");
        driver.findElement(By.xpath("//*[@id='ContactNumber']")).sendKeys("9398107345");
        Thread.sleep(2000);
        JavascriptExecutor si= (JavascriptExecutor)driver;
  		si.executeScript("window.scrollBy(0,350)","");
  		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='UserAdrress']")).sendKeys("KOTTISA,VANGARA(MAND),SRIKAKULAM(DIST),PIN CODE 532461");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name='PersonalId']")).sendKeys("Aadhar");
        Thread.sleep(3000);
      	
        Select yr=new Select(driver.findElement(By.xpath("//select[@id='Gender']")));
        yr.selectByVisibleText("Female");
          Select sc=new Select(driver.findElement(By.xpath("//*[@id='CountryId']")));
	    
	    sc.selectByVisibleText("India");
	    Select zc=new Select(driver.findElement(By.xpath("//*[@name='StateId']")));
	    zc.selectByValue("6");
	    Thread.sleep(2000);
	    Select pc=new Select(driver.findElement(By.xpath("//*[@name='CityId']")));
	    pc.selectByVisibleText("Bobbili");
	    
	    driver.close();
	}

}

