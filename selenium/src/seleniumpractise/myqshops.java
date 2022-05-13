package seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class myqshops {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://myqshops.com/UserManagement/CustomerRegistration");
    driver.findElement(By.id("FirstName")).sendKeys("naveenprasad");
    driver.findElement(By.id("LastName")).sendKeys("ponduru");
    driver.findElement(By.id("EmailId")).sendKeys("naveenprasadrock@gmail.com");
    driver.findElement(By.id("PWord")).sendKeys("naveenprasad@5c3");
    driver.findElement(By.id("CnfPWord")).sendKeys("naveenprasad@5c3");
    driver.findElement(By.id("ContactNumber")).sendKeys("7013433108");
    driver.findElement(By.id("UserAdrress")).sendKeys("2-25/10/18gacchibowli");
    driver.findElement(By.id("PersonalId")).sendKeys("0267");
 

     
  //   driver.findElement(By.xpath("//button[@type='submit']")).click();
     
   // WebElement Fileinput=driver.findElement(By.name("uploadedProfileImage"));
      //    Fileinput.sendKeys("C:\\Users\\sk\\Pictures");
    Thread.sleep(3000);
     Select yr=new Select(driver.findElement(By.xpath("//*[@id=\"Gender\"]")));
     yr.selectByVisibleText("Male");
//     Select yr1=new Select(driver.findElement(By.xpath("//*[@id=\"CountryId\"]")));
//     yr1.selectByVisibleText("India");
     Select Yr1=new Select(driver.findElement(By.id("CountryId")));
     Yr1.selectByVisibleText("India");		
  Select Yr2=new Select(driver.findElement(By.xpath("//*[@id=\"StateIdCheck\"]")));
    Yr2.selectByVisibleText("Telangana");
//  	 Select Yr3=new Select(driver.findElement(By.id("CityIdCheck")));
//       Yr3.selectByVisibleText("Hyderabad");
     
   
    

	}

}
