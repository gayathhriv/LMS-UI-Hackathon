package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseClass;

public class LoginPage extends baseClass {
	
	@FindBy(xpath = "//input[@id= 'username']")
	@CacheLookup
	WebElement username;
	
	@FindBy(name = "//input[@id= 'password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "//input[@id= 'Login']")
	@CacheLookup
	WebElement loginBtn;
	
	//initializing the Page Objects
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	//actions (sending values)
	public void login(String uname, String pwd)
	{
		username.clear();
		username.sendKeys(uname);
		password.clear();
		password.sendKeys(pwd);
	
	}
	
	public void loginclick()
	{
		loginBtn.click();
	}
}
