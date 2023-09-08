package testclasses;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.DarazHomePage;
import pages.HelpCenterPage;
import utilities.DriverSetup;

public class HelpCenterTest extends DriverSetup{
	DarazHomePage darazHomePage = new DarazHomePage();
	HelpCenterPage helpCenterPage = new HelpCenterPage();
	
	@Test(description = "Testing help center page title")
	@Description("Testing help center page title--Allure")
	public void TestHelpCenterPageTitle() {
		getDriver().get("https://www.daraz.com.bd");
		helpCenterPage.takeScreenShot("Help Center Page");
		darazHomePage.clickOnElement(darazHomePage.CUSTOMER_CARE_BUTTON);
		helpCenterPage.takeScreenShot("Help Center Page");
		darazHomePage.waitForElementVisiable(darazHomePage.HELP_CENTER_BUTTTON);
		darazHomePage.clickOnElement(darazHomePage.HELP_CENTER_BUTTTON);
		helpCenterPage.waitForElementVisiable(helpCenterPage.HELP_CENTER_TEXT);
		assertEquals(getDriver().getTitle(), helpCenterPage.HELP_CENTER_PAGE_TITLE);
		
	}
}
