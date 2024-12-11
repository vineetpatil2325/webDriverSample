package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
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
	  
	  
	  Set<String> wins=driver.getWindowHandles();
	  System.out.println("No of windows.."+wins.size());
	  for(String child : wins) {
		  System.out.println("Wind Handles...."+child);
		  if(!child.equalsIgnoreCase(parentwin)) {
			  Thread.sleep(2000);
			  String h1TagText = driver.findElement(By.cssSelector("h1#sampleHeading")).getText();
			  System.out.println("Text in Tab Window..."+h1TagText);
		  }  
	  }
	  
	 driver.close(); 
	 
	 driver.switchTo().window(parentwin);
	 driver.findElement(By.id("windowButton")).click();
	 
	 Set<String> popwins=driver.getWindowHandles();
	  System.out.println("No of windows.."+popwins.size());
	  for(String child : popwins) {
		  System.out.println("Wind Handles...."+child);
		  if(!child.equalsIgnoreCase(parentwin)) {
			  Thread.sleep(2000);
			  String h1TagText = driver.findElement(By.cssSelector("h1#sampleHeading")).getText();
			  System.out.println("Text in popup win..."+h1TagText);
		  }  
	  }
	  
	  driver.switchTo().newWindow(WindowType.WINDOW);
	  driver.get("https://testautomationpractice.blogspot.com/");
	 
	 
	  
  }
}
