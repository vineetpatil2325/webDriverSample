package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSExcelTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  
	  driver.get("https://ecommerce-playground.lambdatest.io/");
	  JavascriptExecutor js =(JavascriptExecutor) driver;
	  	String strTitle = (String)js.executeScript("return documnt.title");
	  System.out.println(strTitle);
	  
	  WebElement searchbox = (WebElement)js.executeScript(
			  "return documnt.getElementByName('search')[0]");
	  searchbox.sendKeys("Phone");
	  driver.findElement(By.cssSelector("button.type-text")).click();
	  js.executeScript("history.go9-(-1)");
	  js.executeScript("window.scrollBy(10,700)");
	  js.executeScript("window.scrollBy(10,document.body.scrollHeight)");
	  
  }
}
