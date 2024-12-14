package parallelScripts;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SampleOneTest {
	
	WebDriver driver;
  @Test
  public void testOne() {
	  long id =Thread.currentThread().getId();
	  System.out.println("Test21 in SampleOne..."+id);
	  driver= new ChromeDriver();
  }
  
  @Test(invocationCount = 4, threadPoolSize = 2, timeOut = 10000)
  public void testTwo() {
	  long id =Thread.currentThread().getId();
	  System.out.println("Test21 in SampleOne..."+id);
	  driver= new ChromeDriver();
  }
  
  @Test
  public void testThree() {
	  long id =Thread.currentThread().getId();
	  System.out.println("Test21 in SampleOne..."+id);
	  driver= new ChromeDriver();
  }
  
  @Test
  public void testFour() {
	  long id =Thread.currentThread().getId();
	  System.out.println("Test24 in SampleOne..."+id);
	  driver= new ChromeDriver();
  }
 
  @AfterMethod
  public void tearDown() {
	//  driver.close();
  }
  
  
  
  
}
