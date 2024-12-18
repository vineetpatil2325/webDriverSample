package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CDPTest {
	ChromeDriver driver;
	DevTools devTools;
	
  @BeforeTest
  public void setup() {
	  driver = new ChromeDriver();
	  
	  devTools = driver.getDevTools();
	  devTools.createSession(driver.getWindowHandle());
	  
  }
  
 // @Test
  public void deviceModeTest() {
	  Map deveiceMetrics = new HashMap() {{
		  put("width",800);
		  put("height",1100);
		  put("deviceScaleFactor",50);
		  put("mobile",true);

	  }};
	  driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deveiceMetrics);
	  driver.get("https://www.selenium.dev/");
	  
	  }
  
  @Test
   public void geoLocationTest() {
	   
	   Map deviceMetrics =new HashMap() {{
		   put("latitude",33.748997);
		   put("longitute", -84.387985);
		   put("accuracy", 100);
	   }};
	   driver.executeCdpCommand("Emulation.setGeolocationOverride", deviceMetrics);
	   driver.get("https://oldnavy.gap.com/stores");
	   }
	   
   }
  

