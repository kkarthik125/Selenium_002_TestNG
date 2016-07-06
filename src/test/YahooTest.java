package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class YahooTest {
	
  @BeforeSuite  // once before executing all tests in all java files
  public void initializeSelenium(){
	  // You can initialize the webdriver object
	  // or RC object
	  System.out.println("In the very Beginning - Initialize Selenium");
  }
  
  @AfterSuite  // once after executing all tests in all java files
  public void shutDownSelenium(){
	  // You can destroy the Selenium Object
	  System.out.println("In the very End - Destroy Selenium");
 }
	
  @Test
  public void testReceiveMail() {
	  System.out.println("Testing Receiving Mail");
  }
  
  @Test
  public void testSendMail() {
	  System.out.println("Testing Sending Mail");
  }
  
  @BeforeMethod
  public void openBrowser() {
	  System.out.println("Opening Browser");
	  // You can open a browser
  }
  
  @AfterMethod
  public void closeBrowser() {
	  System.out.println("Closing Browser");
	  // You can close a browser
  }
  
  public void beforeMethod1() {
	  System.out.println("In Before Method 1");
  }
  
  @AfterTest   // after executing all test cases
  public void CloseDBConnection() {
	  System.out.println("Closing a database connection");
	  // You can close a database connection
  }

  @BeforeTest   // before executing all test cases
  public void OpenDBConnection() {
	  System.out.println("Opening a database connection");
	  // You can open a database connection
  }

}
