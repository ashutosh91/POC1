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
	public Properties prop;

	public WebDriver initDriver() throws IOException {
		
		prop = new Properties();
		//FileInputStream fis = new FileInputStream("/Users/ashu/eclipse/workspace/POC1/src/main/java/Resources/Data.properties");
		FileInputStream fis = new FileInputStream("D:/POC1/src/main/java/Resources/Data.properties");
	
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "/Users/ashu/Tools/chromedriver");
			System.setProperty("webdriver.chrome.driver", "E:\\program files\\chromedriver.exe");
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
