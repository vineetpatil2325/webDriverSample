package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  Actions actions =new Actions(driver);
	  driver.get("https://testautomationpractice.blogspot.com/");
	  WebElement btn= driver.findElement(By.xpath("//button[contains(text(),'Point Me')]"));
	  WebElement txtFeild= driver.findElement(By.id("field2"));
	  
	  actions.scrollToElement(txtFeild).perform();
	  actions.moveToElement(btn).perform();
	  WebElement item2= driver.findElement(By.linkText("Laptops"));
	  actions.click(item2).perform();
	  
	  WebElement btnDb1= driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
	  actions.doubleClick(btnDb1).perform();
	  actions.contextClick(txtFeild).perform();
	  
	  //DRag an Drop
	  WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
	  WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
	  
	  actions.dragAndDrop(drag, drop).perform();
	  
	  
	  

	  
  }
}
