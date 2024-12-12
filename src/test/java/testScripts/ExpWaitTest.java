package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpWaitTest {
  @Test
  public void f() {

	  WebDriver driver=new ChromeDriver();
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  
	  driver.get("http://uitestingplayground.com/ajax");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  
	  
	  
	  driver.findElement(By.id("ajaxButton")).click();
	  
	  wait.until(ExpectedConditions.textToBePresentInElement(
			  driver.findElement(By.cssSelector("div#content")),
			  "Data loaded with AJAX get request."));
	  
	  WebElement elem=driver.findElement(By.cssSelector("p.bg-success"));
	  String strTxt=elem.getText();
	  Assert.assertEquals(strTxt, "Data loaded with AJAX get request.");
	  System.out.println(strTxt);
  }
}
