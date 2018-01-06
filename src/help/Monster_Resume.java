package help;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Monster_Resume {
	static WebDriver driver;
	static {
		// System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver",
		// "./driver/geckodriver.exe");
	}

	@Test
	public void Monster_Profile_Update() throws InterruptedException, AWTException, IOException {
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		// driver = new ChromeDriver(options);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.monsterindia.com/");
		String windowTitle = getCurrentWindowTitle();
		String mainWindowHandle = getMainWindowHandle(driver);
		Assert.assertTrue(closeAllOtherWindows(mainWindowHandle));
		Assert.assertTrue("Main Window Title is not Matching", windowTitle.contains("Monster India"));
		driver.manage().window().maximize();
		try {
			driver.findElement(By.xpath("//a[.='Sign In']")).click();
			driver.findElement(By.id("username_login")).sendKeys("srinivasab@gmail.com");

			/*
			 * WebDriverWait wait = new WebDriverWait(driver,30);
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
			 * xpath( "//input[@id='password_input']")));
			 */
			driver.findElement(By.cssSelector("#passwd_temp")).sendKeys("Srini765");
			// driver.findElement(By.xpath("//input[@id='password_input' and
			// @type='password']")).sendKeys("Srini765");
			driver.findElement(By.xpath("//input[@value='Sign In']")).click();

		} catch (Exception e) {
			System.out.println("Exception occurs - "+e.getMessage());
		}

	}

	public String getCurrentWindowTitle() {
		String WindowTitle = driver.getTitle();
		return WindowTitle;
	}

	public String getMainWindowHandle(WebDriver driver) {
		return driver.getWindowHandle();
	}

	public boolean closeAllOtherWindows(String openWindowHandle) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String currentWindowHandle : allWindowHandles) {
			if (!currentWindowHandle.equals(openWindowHandle)) {
				driver.switchTo().window(currentWindowHandle);
				driver.close();
			}

		}
		driver.switchTo().window(openWindowHandle);
		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}

}
