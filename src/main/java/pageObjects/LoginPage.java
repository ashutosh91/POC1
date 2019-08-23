package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_email")
	WebElement email;

	@FindBy(id="user_password")
	WebElement password;
	
	@FindBy(css="#new_user > div.form-group.text-center > input")
	WebElement loginBtn;
	
	
	public WebElement EmailID() {
		return email;
	}
	
	public WebElement Password() {
		return password;
	}
	
	public WebElement LoginBtn() {
		return loginBtn;
	}
	
}
