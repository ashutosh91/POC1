package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#homepage > header > div.tools > div > nav > ul > li:nth-child(4) > a > span")
	WebElement login;
	
	@FindBy(css = "#content > div > div > h2")
	WebElement title;
	
	@FindBy(css = "#homepage > header > div.navbar.navbar-default.navbar-static-top > div > nav > ul")
	WebElement navbar;

	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getTitle() {
		return title;
	}
	
	public WebElement getNavBar() {
		return navbar;
	}
}
