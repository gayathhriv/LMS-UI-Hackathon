package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.HomePage;
import Pages.LoginPage;
import baseClass.baseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class LoginPageSteps extends baseClass {

    public static LoginPage lp = new LoginPage();
    public static HomePage hp = new HomePage();
	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		
		driver = new ChromeDriver();
		driver.get(prop.getProperty("browser"));
		baseClass.setUpBrowser();
		   
	}

	@When("User opens the LMS Website")
	public void user_opens_the_lms_website() {
		
	    driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

	@Then("User should see the Login page")
	public void user_should_see_the_login_page() {
		
	    String CurrentUrl = driver.getCurrentUrl();
	    Assert.assertEquals("https://lms-frontend-phase2.herokuapp.com/login", "url");
	}

	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
		
		boolean PageContent = driver.getPageSource().contains("Please login to LMS application");
		Assert.assertEquals(PageContent,true);
	}

	@When("User clicks the Login button after entering valid username and password")
	public void user_clicks_the_login_button_after_entering_valid_username_and_password() {
	    
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
		lp.loginclick();
		
	}

	@Then("User should see the LMS Home page.")
	public void user_should_see_the_lms_home_page() {
		
		hp = new HomePage();
		boolean hpPageContent = driver.getPageSource().contains("LMS - Learning Management System");
		Assert.assertEquals(hpPageContent,true);
			 
	}

	@When("User clicks the Login button after invalid username or password")
	public void user_clicks_the_login_button_after_invalid_username_or_password(DataTable dataTable) {
		List<String> loginPage = dataTable.asList();
        String userName = loginPage.get(0);
        String passWord = loginPage.get(1);
        //driver.findElement(By.name("txtUsername")).sendKeys(userName);
       // driver.findElement(By.name("txtPassword")).sendKeys(passWord);
		
	}

	@Then("User should not get logged in")
	public void user_should_not_get_logged_in() {
	    
		System.out.println("Invalid username and password. Please try again");
	}

}
