package parallelScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SampleThreeTest {
	
	WebDriver driver;
  @Test
  public void testOne() {
	  
	  long id =Thread.currentThread().getId();
	  System.out.println("Test29 in SampleThree..."+id);
	  driver= new ChromeDriver();
  }
  
  @Test
  public void testTwo() {
	  long id =Thread.currentThread().getId();
	  System.out.println("Test30 in SampleThree..."+id);
	  driver= new ChromeDriver();
	  
  }
  
  @Test
  public void testThree() {
	  long id =Thread.currentThread().getId();
	  System.out.println("Test31 in SampleThree..."+id);
	  driver= new ChromeDriver();
  }
  
  @Test
  public void testFour() {
	  long id =Thread.currentThread().getId();
	  System.out.println("Test32 in SampleThree..."+id);
	  driver= new ChromeDriver();
  }
  
  @AfterMethod
  public void tearDown() {
	 // driver.close();
  }
 
  
}
