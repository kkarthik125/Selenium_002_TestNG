package testcases;

import org.testng.annotations.Test;

public class TestCases {
	
	
	@Test(priority=1,dataProviderClass=Data_Provider.class,dataProvider="sampleProvider")
	public void testA(String username, String password){
		System.out.println("Username: "+username);
		System.out.println("password: "+password);
	}
	
	@Test(priority=2,dataProviderClass=Data_Provider.class,dataProvider="sampleProvider")
	public void testB(String username, String password, String email){
		System.out.println("Username: "+username);
		System.out.println("password: "+password);
		System.out.println("email: "+email);
		
	}

}
