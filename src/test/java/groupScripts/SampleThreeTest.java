package groupScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
  @Test(groups="featureOne")
  public void testOne() {
	  System.out.println("Test29 in SampleThree...");
  }
  
  @Test(groups="featureTwo")
  public void testTwo() {
	  System.out.println("Test30 in SampleThree...");
	  
  }
  
  @Test(groups="featureThree")
  public void testThree() {
	  System.out.println("Test31 in SampleThree...");
  }
  
  @Test(groups="featureFour")
  public void testFour() {
	  System.out.println("Test32 in SampleThree...");
	  
  }
  
}
