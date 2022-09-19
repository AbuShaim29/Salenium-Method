package BaseUtil2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import bestbuypages.HomePage;

public class BaseClass {
	WebDriver driver;
	HomePage homePage = new HomePage(driver);
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abu shaim\\eclipse-workspace\\gov.portal.bestbuy\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/portal");
	}
	
	@AfterMethod
	public void tearup() {
		driver.quit();
	}
	
	

}
