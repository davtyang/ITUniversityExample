package am.ituniversity.qa.ineco.guest;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.ituniversity.qa.ineco.base.InecoBaseTest;

public class InecoMenuTests extends InecoBaseTest {
	
	@Test
	public void savingsMenuTest() {
		//1. Open inecobank.am/en -- before test
		IndividualGuestHomePage individualHome = new IndividualGuestHomePage(driver);
		
		individualHome = individualHome.clickOnSavingsLink();
		
		InecoSavePage inecoSave = individualHome.clickOnInecoSaveLink();
		inecoSave.waitForInecoSaveTitleVisible();
		Assert.assertTrue(inecoSave.inecoSaveTitle.isDisplayed());
		//2. Click on Savings link
		//3. Click on Ineco Save link
		// Expected result:
		// Assert that Apply button is visible
		// Assert that url is https://www.inecobank.am/en/Individual/account/inecosave
		// assert that Open InecoSave saving account with Inecobank text is visible on the page at an exact location -- xpath
		
	}

}
