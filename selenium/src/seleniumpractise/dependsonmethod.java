package seleniumpractise;

import org.testng.annotations.Test;

public class dependsonmethod {
	@Test
	public void browserLaunch()
	{
		System.out.println("Browser Launched");
	}
	@Test(dependsOnMethods="browserLaunch")
	public void Login()
	{
		System.out.println("LoginPage launch");
	}
   @Test(dependsOnMethods="Login")
   public void homePage()
   {
	   System.out.println("Home Page Launched");
   }

	}


