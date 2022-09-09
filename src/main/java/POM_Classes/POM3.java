package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3 {
	//Declaration
			@FindBy(xpath="//span[@class='user-id']")private WebElement userID;


			//initialization
			public POM3(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			//utilization
			public String verifyuserID() {

				String actID = userID.getText();
				return actID;
			}
}
