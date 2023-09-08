package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	public String LOGINPAGETITLE = "Daraz.com.bd: Online Shopping Bangladesh - Mobiles, Tablets, Home Appliances, TV, Audio &amp; More";
	public By PHONE_NUMBER_EMAIL_INUPT_FIELD = By.xpath("//input[@placeholder='Please enter your Phone Number or Email']");
	public By PASSWORD_INPUT_FIELD = By.xpath("//input[@placeholder='Please enter your password']");
	public By LOGINBUTTON = By.xpath("//button[normalize-space()='LOGIN']");
	public By TOST_MESSAGE = By.className("next-feedback-content");

	
	public void doLogin(String email, String password) {
		write(PHONE_NUMBER_EMAIL_INUPT_FIELD, email);
		write(PASSWORD_INPUT_FIELD, password);
		clickOnElement(LOGINBUTTON);
	}
}
