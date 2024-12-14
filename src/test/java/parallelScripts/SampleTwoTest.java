package parallelScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SampleTwoTest {
	WebDriver driver;
  @Test
  public void testOne() {
	  long id =Thread.currentThread().getId();
	  System.out.println("Test25 in SampleTwo..."+id);
	  driver= new EdgeDriver();
  }
  
  @Test
  public void testTwo() {
	  long id =Thread.currentThread().getId();
	  System.out.println("Test26 in SampleThree..."+id);
	  driver= new EdgeDriver();

  }
  
  @Test
  public void testThree() {
	  long id =Thread.currentThread().getId();
	  System.out.println("Test27 in SampleThree..."+id);
	  driver= new EdgeDriver();

  }
  
  @Test
  public void testFour() {
	  long id =Thread.currentThread().getId();
	  System.out.println("Test28 in SampleThree..."+id);
	  driver= new EdgeDriver();

  }
  
  
  @AfterMethod
  public void tearDown() {
	 // driver.close();
  }
 
  
}
