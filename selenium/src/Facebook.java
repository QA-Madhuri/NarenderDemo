import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook { 
	public static void main(String args[]) {
		System.setProperty("Webdriver.chrome,driver","C:\\Users\\sk\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.close();
				
	}

}
