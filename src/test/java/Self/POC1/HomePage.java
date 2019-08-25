package Self.POC1;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends Base{

	@BeforeTest
	public void initialize() throws IOException {
	driver = initDriver();
    }
		
	@Test(dataProvider = "getData")
	
	public void basePageNavigation(String email, String password) throws IOException {
		
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.EmailID().sendKeys(email);
		lp.Password().sendKeys(password);
		lp.LoginBtn().click();
	}
	
	
	@DataProvider
	public Object[][] getData() {
		// Row stands for how many different data types test should run
		// Columns stand for how many values for per each test
		Object[][] data = new Object[3][2];
		
		// 0th row
		data[0][0] = "first@gmail.com";
		data[0][1] = "12345";
	
		// 1st row
		data[1][0] = "second@gmail.com";
		data[1][1] = "78945";
		
		// 2nd row
		data[2][0] = "third@gmail.com";
	    data[2][1] = "36547";
  
	    return data;
	}
	
	@AfterTest
	public void teardown() {
	  driver.close();
    }
	
}
