package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/ashu/eclipse/workspace/POC1/src/main/java/Resources/Data.properties");
		//FileInputStream fis = new FileInputStream("D:/POC1/src/main/java/Resources/Data.properties");
	
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/ashu/Tools/chromedriver");
			//System.setProperty("webdriver.chrome.driver", "E:\\program files\\chromedriver.exe");
		    
		    ChromeOptions chromeOptions = new ChromeOptions();
		    chromeOptions.addArguments("--headless");
		    //chromeOptions.setHeadless(true);
			
			driver = new ChromeDriver(chromeOptions);
			
		}
/*		else if(browserName.equalsIgnoreCase"firefox") {
			// firefox code
		}
		else if(browserName.equalsIgnoreCase("IE"){
			// IE code
		}
*/	
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	
	}
	
	
}
