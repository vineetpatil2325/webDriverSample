package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GooglePageTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  //WebElement searchBox=driver.findElement(By.id("APjFqb"));
	  //WebElement searchBox=driver.findElement(By.name("q"));
	  //WebElement searchBox=driver.findElement(By.className("gLFyf"));
	  WebElement searchBox=driver.findElement(By.tagName("textarea"));
	  
	  searchBox.sendKeys("Selenium Tutorial");
	  searchBox.sendKeys(Keys.ENTER);
	  
	  System.out.println("Page Title..."+driver.getTitle());
	  driver.navigate().back();
	  
	  System.out.println("Page Title..."+driver.getTitle());
	  driver.navigate().forward();
	  System.err.println("page Url.."+driver.getCurrentUrl());
	  //Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	  
  }
}
