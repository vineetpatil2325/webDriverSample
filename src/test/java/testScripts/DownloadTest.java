package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DownloadTest {
  @Test
  public void fileDownload() throws InterruptedException {
	  ChromeOptions options =new ChromeOptions();
	  
	  Map<String, Object> prefs=new HashMap<String,Object>();
	  prefs.put("download.promt_for_download", false);
	  options.setExperimentalOption("prefs", prefs);
	  WebDriver driver= new ChromeDriver(options);
	  driver.get("https://selenium.dev/downloads/");
	  
	  Actions actions=new Actions(driver);
	  
	  Thread.sleep(5000);
	  actions.scrollByAmount(100, 90).perform();
	  driver.findElement(By.xpath("//a[text() = '4.27.0']")).click();
	  
  }
}
