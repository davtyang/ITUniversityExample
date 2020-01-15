package am.ituniversity.qa.ineco.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class InecoBaseTest {

	protected WebDriver driver;
	
	@BeforeTest
	public void prepareEnv() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AHOVSEPYAN\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.inecobank.am/en/");
		
	}
}
