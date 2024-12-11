package testScripts;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioChkBoxtest {
  @Test
  public void selectedRadioTest() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  //driver.get("https://the-internet.herokuapp.com/checkboxes");
	  driver.get("https://the-internet.herokuapp.com/checkboxes");
	 driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	  boolean isSel = driver.findElement(
			  By.xpath("(//input[@type='checkbox'])[2]")).isSelected();
	  if(isSel) {
		  driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	  } 
	  
	  driver.findElement(By.xpath(""));
	  
	  
  }
}
