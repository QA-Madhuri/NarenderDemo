package seleniumpractise;






	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;


	public class date {

	public static void main(String[] args) throws InterruptedException {
	


	String month="Dec 2020";
	//String day="24";

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(opt);

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.redbus.in/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.findElement(By.id("src")).sendKeys("hyderabad");;
	driver.findElement(By.xpath("//li[contains(text(),'Kukatpally, Hyderabad')]")).click();
	driver.findElement(By.id("dest")).sendKeys("amalapuram");
	driver.findElement(By.xpath("//li[@class='selected']")).click();
	WebElement date=driver.findElement(By.xpath("//*[@id='onward_cal']"));
	date.click();
	Thread.sleep(3000);
	while(true) {
	String Text=driver.findElement(By.xpath("//*[@class='monthTitle']")).getText();

	System.out.println(Text);

	if(Text.equals(month)) {
	break;
	}else {
	driver.findElement(By.xpath("//*[@class='next']")).click();
	}

	}

	driver.findElement(By.xpath("//td[contains(text(),'24')]")).click();

	driver.findElement(By.id("search_btn")).click();


	}


	


	}


