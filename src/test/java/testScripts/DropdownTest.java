package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTest {
  @Test
  public void selectValue() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  Select Sel =new Select(driver.findElement(By.id("country")));
	  //Sel.selectByValue("usa");
	  //Sel.selectByVisibleText("United Kingdom");
	  Sel.selectByIndex(9);
  }
}
