package webdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriScenario {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		while (it.hasNext()) {
			String window = it.next();
			if (!parentWindow.equals(window)) {
				driver.switchTo().window(window);
				System.out.println("Title of the child window - " + driver.getTitle());
				driver.close();
			}

		}
		driver.switchTo().window(parentWindow);
		System.out.println("Title of parent window - " + driver.getTitle());
	}
}
