package am.ituniversity.qa.ineco.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InecoSavePage extends IndividualGuestHomePage{

	public InecoSavePage(WebDriver driver) {
		super(driver);
	}
	
	public static final String INECO_SAVE_TITLE_XPATH="//h1[@class='customDetailBanner__title' and text() = 'Open InecoSave saving account with Inecobank']";
	
	@FindBy(xpath=INECO_SAVE_TITLE_XPATH)
	WebElement inecoSaveTitle;

	public void waitForInecoSaveTitleVisible() {
		waitForElementPresent(INECO_SAVE_TITLE_XPATH);
	}
}
