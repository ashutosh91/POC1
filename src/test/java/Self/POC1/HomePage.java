package Self.POC1;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends Base{

	@Test(dataProvider = "getData")
	
	public void basePageNavigation(String email, String password) throws IOException {
		
		driver = initDriver();
		driver.get("http://qaclickacademy.com");
		
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.EmailID().sendKeys("abc@gmail.com");
		lp.Password().sendKeys("123456");
		lp.LoginBtn().click();
	}
	
	
	@DataProvider
	public Object[][] getData() {
		// Row stands for how many different data types test should run
		// Columns stand for how many values for per each test
		Object[][] data = new Object[1][1];
		
		// 0th row
		data[0][0] = "first@gmail.com";
		data[0][1] = "12345";
		
		// 1st row
		data[1][0] = "second@gmail.com";
		data[1][1] = "78945";
		
		// 2nd row
		data[1][0] = "third@gmail.com";
	    data[1][1] = "36547";
	    
	    return data;
	}
	
}
