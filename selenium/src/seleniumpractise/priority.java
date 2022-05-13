package seleniumpractise;

import org.testng.annotations.Test;

public class priority {

	
		@Test(priority=1)
		public void addition()
		{
			System.out.println("Addition Method");
		}
		@Test(priority=3)
		public void subtraction()
		{
			System.out.println("Subtraction Method");
		}
		@Test(priority=2)
		public void Multiplication()
		{
			System.out.println("Multiplication Method");
		}


	}


