package baseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.HomePage;
import Pages.LoginPage;

public class baseClass{

		public static WebDriver driver;
		public static Properties prop;
		public static LoginPage lp;
		public static HomePage hp;
		
		
		public baseClass() {
			 prop = new Properties();
			 try {
				FileInputStream fis = new FileInputStream(".src/test/resources/configuration/configfile.properties");
				prop.load(fis);
			} catch (IOException e) {
				e.getMessage();
			}
			 	 
		}
		
		public static void setUpBrowser()
		{
			String browserName = prop.getProperty("browser");
			if(browserName.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", ".src/test/resources/driver/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browserName.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", ".src/test/resources/driver/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
		driver.get(prop.getProperty("url")); //url is launched
		}
	
}
		
		
