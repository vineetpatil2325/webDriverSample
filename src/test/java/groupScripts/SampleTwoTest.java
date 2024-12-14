package groupScripts;

import org.testng.annotations.Test;

public class SampleTwoTest {
  @Test(groups="featureOne")
  public void testOne() {
	  System.out.println("Test25 in SampleTwo...");
  }
  
  @Test(groups="featureTwo")
  public void testTwo() {
	  System.out.println("Test26 in SampleTwo...");

  }
  
  @Test(groups="featureThree")
  public void testThree() {
	  System.out.println("Test27 in SampleTwo...");

  }
  
  @Test(groups="featureFour")
  public void testFour() {
	  System.out.println("Test28 in SampleTwo...");

  }
  
}
