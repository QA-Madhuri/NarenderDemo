package seleniumpractise;

import org.testng.annotations.Test;

public class includeandexcludetestng {

	@Test(priority=1)
	public void addition()
	{
		System.out.println("Addition Method");
	}
	@Test
	public void subtraction()
	{
		System.out.println("Subtraction Method");
	}
	@Test
	public void Multiplication()
	{
		System.out.println("Multiplication Method");
	   }
}
