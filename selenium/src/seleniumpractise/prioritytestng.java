package seleniumpractise;

import org.testng.annotations.Test;

public class prioritytestng {
	@Test(priority=1)
	public void addition()
	{
		System.out.println("Sunday Method");
	}
	@Test(priority=3)
	public void subtraction()
	{
		System.out.println("Monday Method");
	}
	@Test(priority=2)
	public void Multiplication()
	{
		System.out.println("Tuesday Method");

	}

}
