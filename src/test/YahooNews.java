package test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooNews {
	
	@BeforeTest
	public void xyz(){
		System.out.println("Before executing Yahoo news test");
	    // throw new SkipException("Skipping the test because of some reason");
	}

	@Test
	public void testNews(){
		System.out.println("Executing Yahoo news test");
		
		Assert.assertEquals("Good","Good"); // Passing
		// Assert.assertEquals("Good_123","Good"); // Failing

		Assert.assertTrue(6>1, "Error Message for 6>1"); // Passing
		// Assert.assertTrue(6<1, "Error Message for 6<1"); // Failing

		Assert.assertFalse(1>9, "Error Message for 1>9"); // Passing
		// Assert.assertFalse(1<9, "Error Message for 1<9"); // Failing
		
		System.out.println("Before assertion error");
		try{
			Assert.assertTrue(6<1, "Error Message for 6<1"); // Failing
		}catch(Throwable t){
			System.out.println("Caught the error");
			// error
			// code - report the error onto the reports
		}
		System.out.println("After assertion error");

		
	}
}
