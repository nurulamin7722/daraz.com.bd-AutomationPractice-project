package pages;

import org.openqa.selenium.By;

public class DarazHomePage extends BasePage{
	public By SIGNUPLOGINBUTTON = By.xpath("//a[normalize-space()='Signup / Login']");
	public By LOOGED_ACCOUNT_NAME = By.xpath("//span[@id='myAccountTrigger']");
	public By CUSTOMER_CARE_BUTTON = By.xpath("//span[normalize-space()='CUSTOMER CARE']");
	public By HELP_CENTER_BUTTTON = By.xpath("//a[contains(text(),'Help Center')]");
    
	public void clicOnSignUpLoginButton() {
		clickOnElement(SIGNUPLOGINBUTTON);
	}

}
