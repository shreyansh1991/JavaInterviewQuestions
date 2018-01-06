package other;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SystemExitDemo {
	public static void main(String[] args) {
		// System.setProperty("webdriver.ie.driver", "./IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// WebDriver driver = new InternetExplorerDriver();
		WebDriver driver = new ChromeDriver();
		/*
		 * DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		 * cap.setCapability(InternetExplorerDriver.
		 * INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		 * cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 * cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		 */ driver.manage().window().maximize();
		// driver.navigate().to("https://www.google.com");
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("p").build().perform();
		// driver.close();
	}
}