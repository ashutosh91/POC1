package Self.POC1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;

	public WebDriver initDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/ashu/eclipse/workspace/POC1/src/main/java/Resources/Data.properties");
	
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/ashu/Tools/chromedriver");
		    driver = new ChromeDriver();
		    
		}
/*		else if(browserName.equalsIgnoreCase"firefox") {
			// firefox code
		}
		else if(browserName.equalsIgnoreCase("IE"){
			// IE code
		}
*/	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	
	}
	
	
}
