package testclasses;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DarazHomePage;
import pages.LoginPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class LoginTest extends DriverSetup{
	DarazHomePage darazHomePage = new DarazHomePage();
	LoginPage loginPage = new LoginPage();
	
	@Test
	public void loginPageTitle() {
		getDriver().get("https://www.daraz.com.bd");
		darazHomePage.clicOnSignUpLoginButton();
		assertEquals(getDriver().getTitle(), loginPage.LOGINPAGETITLE);
	}
	@Test(dataProvider = "invalidCredentials", dataProviderClass = DataSet.class)
	public void loginTestwithInvalidCredential(String phoneNumber, String password, String message) {
		getDriver().get("https://www.daraz.com.bd");
		darazHomePage.clicOnSignUpLoginButton();
		loginPage.doLogin(phoneNumber, password);
		assertEquals(loginPage.getElementText(loginPage.TOST_MESSAGE) , message);
		loginPage.takeScreenShot("unsuccessful log in ");
	}
	
}
