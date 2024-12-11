package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewWindowTab {
  @Test
  public void windowTest() throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  Actions actions=new Actions(driver);
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/browser-windows");
	  String parentwin=driver.getWindowHandle();
	  System.out.println("Parent Win..."+parentwin);
	  Thread.sleep(3000);
	  actions.scrollByAmount(100, 1200).perform();
//	  driver.findElement(By.xpath("//button[contains(text(),'New Tab')]")).click();
	  
	  driver.findElement(By.id("tabButton")).click();
	  System.out.println("page Tiltle..."+driver.getTitle());
	  
	  
	  
	  
	  
  }
}
