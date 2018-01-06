package webdriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		// dc.setBrowserName("FireFox");
		dc.setPlatform(Platform.WINDOWS);
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, dc);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
