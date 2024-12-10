package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/login");
	  
	  WebElement Unm=driver.findElement(By.id("username"));
	  Unm.sendKeys("tomsmith");
	  WebElement Pwd=driver.findElement(By.id("password"));
	  Pwd.sendKeys("SuperSecretPassword!");
	  driver.findElement(By.className("radius")).click();
	  
	 // driver.findElement(By.linkText("Elemental Selenium")).click();
	  driver.findElement(By.partialLinkText("Elemental")).click();
	 
  }
}
