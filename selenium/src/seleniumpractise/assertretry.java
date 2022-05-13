package seleniumpractise;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

public class assertretry {

	
	  @Test
	  public void login()
	  {
		  System.out.println("This is login page");
	  }
	  @Test
	  public void signup()
	  {
		  System.out.println("This is signup page");
		  int i=1/0;
	  }
	  @Test(retryAnalyzer=RetryAnalyzerCount.class)
	  public void compose()
	  {
		  System.out.println("This is compose page");
		  Assert.assertTrue(false);
		                
	  }
	                     

	}


