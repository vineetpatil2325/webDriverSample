package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.openqa.selenium.TakesScreenshot;

public class DisplayTest {
  @Test
  public void DisplayElemTest() throws IOException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://automationbookstore.dev/");
	  
	  TakesScreenshot screen=(TakesScreenshot)driver;
	  File src =screen.getScreenshotAs(OutputType.FILE);
	  	String path =System.getProperty("user.dir")
	  			+"/screenshots"+System.currentTimeMillis()+".png";
	  	FileUtils.copyFile(src, new File(path));
	  
	  driver.findElement(By.id("searchbar")).sendKeys("Test");
	  WebElement closeIcon =driver.findElement(
			  By.cssSelector("a[title ='Clear text]"));
	  if(closeIcon.isDisplayed()) 
	  {
		  closeIcon.click();
	  }
	  
  }
}
