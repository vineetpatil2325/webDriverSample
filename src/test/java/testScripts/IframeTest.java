package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class IframeTest {
  @Test
  public void iframeTest() {
	  WebDriver driver= new ChromeDriver();
//	  Actions actions=new Actions(driver);
	  
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/iframe");
	  
//	  driver.switchTo().frame("mce_0_ifr");
//	  driver.switchTo().frame(0);
	  
	  WebElement iFrameElem=driver.findElement(By.id("mce_0_ifr"));
	  driver.switchTo().frame(0);
	  
	  WebElement inputTxt = driver.findElement(By.id("tinymce"));
	  String strTxt = inputTxt.getText();
	  System.out.println("Txt from Frame ..."+strTxt);
	  
	  
	  // switch back to main page
	  driver.switchTo().defaultContent();
	  WebElement linkTxt = driver.findElement(By.cssSelector("span.tox-statusbar__branding"));
	  linkTxt.click();
	 
  }
}
