package am.ituniversity.qa.ineco.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.ituniversity.qa.ineco.pages.base.InecoBasePage;

public class IndividualGuestHomePage extends InecoBasePage {

	public IndividualGuestHomePage(WebDriver driver) {
		super(driver);
	}

	public static final String SAVINGS_LINK_XPATH="//span[text()='Savings']";
	public static final String INECO_SAVE_LINK_XPATH="//span[text()='Savings']/..//a[@href='/en/Individual/account/inecosave']";
	
	@FindBy(xpath=SAVINGS_LINK_XPATH)
	WebElement savingsLink;
	
	@FindBy(xpath=INECO_SAVE_LINK_XPATH)
	WebElement inecoSaveLink;
	
	public IndividualGuestHomePage clickOnSavingsLink() {
		savingsLink.click();
		return new IndividualGuestHomePage(driver);
	}
	
	public InecoSavePage clickOnInecoSaveLink() {
		waitForElementClickable(INECO_SAVE_LINK_XPATH);
		inecoSaveLink.click();
		return new InecoSavePage(driver);
	}
}
