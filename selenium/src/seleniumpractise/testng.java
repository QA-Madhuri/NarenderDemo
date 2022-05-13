package seleniumpractise;

import org.testng.annotations.Test;

public class testng {
@Test(groups={"smoke"})
		public void test1()
		{
		System.out.println("test1");
		}
		@Test(groups= {"smoke"})
		public void test2()
		{
		System.out.println("test2");
		}
		@Test(groups= {"integration"})
		public void test3()
		{
		System.out.println("test3");
		}
		@Test(groups= {"integration"})
		public void test4()
		{
		System.out.println("test4");
		}
		@Test(groups= {"integration"})
		public void test5()
		{
		System.out.println("test5");
		}
		@Test(groups= {"smoke","integration"})
		public void test6()
		{
		System.out.println("test6");
		}
		

	


}

