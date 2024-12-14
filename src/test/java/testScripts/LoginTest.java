package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
@Parameters("browser")
@BeforeTest
	public void setup(String strBrowser) {
	if(strBrowser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		 
	}
	else if(strBrowser.equalsIgnoreCase("edge")) {
		driver =new EdgeDriver();
		
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}



  @Test
  public void f() {
	  
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
