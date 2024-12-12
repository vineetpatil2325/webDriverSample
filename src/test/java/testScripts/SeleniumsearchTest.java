package testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumsearchTest {
  WebDriver driver;
  
 // @BeforeMethod
  @BeforeTest
  public void setUp() {
	  driver=new ChromeDriver();
  }
  
 // @AfterMethod
  @AfterTest
  public void tearDown() {
	  driver.close();
  }
	@Test(priority = 1)
  public void seleniumSearch() throws InterruptedException {
	  
	  driver.get("https://www.google.com");
	  WebElement searchBox=driver.findElement(By.tagName("textarea"));
	  searchBox.sendKeys("Selenium Tutorial");
	  searchBox.submit();
	  Thread.sleep(2000);
	  Assert.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Search");
	  
	}
	  
	
	  @Test(priority = 2)
	  public void javaSearch() throws InterruptedException {
		  
		  driver.get("https://www.google.com");
		  WebElement searchBox=driver.findElement(By.tagName("textarea"));
		  searchBox.sendKeys("Java Tutorial");
		  searchBox.submit();
		  Thread.sleep(2000);
		  Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
	  
  }
	  
	  @Test(enabled = false)
	  public void cucumberSearch() throws InterruptedException {
		  
		  driver.get("https://www.google.com");
		  WebElement searchBox=driver.findElement(By.tagName("textarea"));
		  searchBox.sendKeys("Cucumber Tutorial");
		  searchBox.submit();
		  Thread.sleep(2000);
		  Assert.assertEquals(driver.getTitle(),"Cucumber Tutorial - Google Search");
	  
  }
	  
	  @Test(enabled = false)
	  public void appiumSearch() throws InterruptedException {
		  
		  driver.get("https://www.google.com");
		  WebElement searchBox=driver.findElement(By.tagName("textarea"));
		  searchBox.sendKeys("Appium Tutorial");
		  searchBox.submit();
		  Thread.sleep(2000);
		  Assert.assertEquals(driver.getTitle(),"Appium Tutorial - Google Search");
	  
  }
	  
	  
	  
	
  
}
