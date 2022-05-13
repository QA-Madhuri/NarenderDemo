package seleniumpractise;

import org.testng.annotations.Test;

public class paralleltestng 
{
public class parallel 
{
    public void testCaseOne() {
	System.out.println("Test Case One Thread Id:-"
			+ Thread.currentThread().getId());
	
}

@Test
public void testCaseTwo() 
{
	System.out.println("Test Case Two Thread Id:-"
			+ Thread.currentThread().getId());

	}

}
}
