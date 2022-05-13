package seleniumpractise;


		import java.util.concurrent.TimeUnit;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.ui.Select;

		public class DeselectOptionExample
		{
		public static void main(String[] args)
		{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String URL = "https://www.seleniumtesting08.blogspot.com/2019/11/dropdown.html";
		driver.get(URL);
		// Wait for some time to load the whole web page.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Locate dropdown element on the web page by By.xpath.
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='Month']"));

		// Create an object of Select class and pass the dropdown of type WebElement as an argument.
		Select select = new Select(dropdown);
		// Verify that the dropdown supports multiple-choice or not..
		if(select.isMultiple())
		{
		System.out.println("Multiple choices are allowed, Select multiple options in the list ");
		}
		else
		{
		System.out.println("Multiple choices are not allowed");
		}
		// Select the option "India" by sending visible text.
		select.selectByVisibleText("May");
		// Select an option by sending its value.
		select.selectByValue("Ap");

		// Select an option by sending its index.
		select.selectByIndex(10);

		// Now, we will deselect already selected option by calling deselectByVisibleText() method of the select class.
		select.deselectByVisibleText("May");
		System.out.println("Option May is deselected successfully");
		driver.close();
		}
		
	}


