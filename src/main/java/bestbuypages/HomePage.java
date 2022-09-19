package bestbuypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
	}

	@FindBy(xpath= "//div[@class='top-fluid-container  ']  ")
	public static WebElement logo;
	
	@FindBy (xpath = "//input[@id='fld-e']")
	public  WebElement userId;
	
	public void clickUserIdField() {
		userId.click();
	}
}
