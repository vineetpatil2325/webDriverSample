package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercisetest {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver =new ChromeDriver();
	  Actions actions=new Actions(driver);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	  driver.manage().window().maximize();
	  driver.get("https://danube-webshop.herokuapp.com/");
	  driver.findElement(By.id("signup")).click();
	  
	  WebElement name=driver.findElement(By.id("s-name"));
	  name.sendKeys("Abhi");
	  WebElement surname= driver.findElement(By.id("s-surname"));
	  surname.sendKeys("Singh");
	  WebElement email= driver.findElement(By.id("s-email"));
	  email.sendKeys("abc@gmail.com");
	  WebElement password= driver.findElement(By.id("s-password2"));
	  password.sendKeys("#Abc123");
	  	  
//	  radio Btn
	  driver.findElement(By.id("myself")).click();

//	  CheckBox
	  driver.findElement(By.id("marketing-agreement")).click();
	  driver.findElement(By.id("privacy-policy")).click();
//	  Register
	  driver.findElement(By.id("register-btn")).sendKeys(Keys.ENTER);
	  
	  WebElement content=driver.findElement(By.xpath("//div[contains(text(),'Welcome back, abc@gmail.com')]"));
	  Assert.assertEquals(content.getText(), "Welcome back, abc@gmail.com");
	  
	 driver.findElement(By.xpath("//input[@name='searchbar']")).sendKeys("Parry Hotter");
	 driver.findElement(By.id("button-search")).click();
	 
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//ul/li[@class='preview']")).click();
//	 driver.findElement(By.className("preview"));
	 
//	 WebElement title=driver.findElement(By.xpath("//h2[contains(text(),'Parry Hotter')]"));
//	 Assert.assertEquals(title.getText(), "Parry Hotter");
	 
	 
	 driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
	 
	 driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
	 Thread.sleep(3000);
	 driver.navigate().back();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[contains(text(),'Empty Cart')]")).click();
	 
	 
	 Thread.sleep(3000);
	 driver.findElement(By.id("logout")).click();
	 
	 Thread.sleep(3000);
	 driver.quit();
	 
	 
	 
	  
  }
}
