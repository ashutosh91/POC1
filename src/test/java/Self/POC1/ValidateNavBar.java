package Self.POC1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

public class ValidateNavBar extends Base{

	@BeforeTest
		public void initialize() throws IOException {
		driver = initDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
		public void basePageNavigation() throws IOException {
		
		LandingPage l = new LandingPage(driver);
		
		Assert.assertTrue(l.getNavBar().isDisplayed(), "Navigation bar not displayed");
		//Assert.assertFalse(l.getNavBar().isDisplayed(), "Navigation bar displayed");	
	}
	
	@AfterTest
		public void teardown() {
		driver.close();
	}
}
