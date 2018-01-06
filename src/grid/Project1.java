package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Project1 {
	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = null;

		System.out.println(" Executing on FireFox");
		String Node = "http://192.168.0.33:4450/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		driver = new RemoteWebDriver(new URL(Node), cap);
		// Puts an Implicit wait, Will wait for 10 seconds before throwing
		// exception
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Launch website
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");

		/*
		 * System.out.println(" Executing on chrome"); String Node1 =
		 * "http://192.168.0.33:8173/wd/hub"; DesiredCapabilities cap1 =
		 * DesiredCapabilities.chrome(); cap1.setBrowserName("chrome"); driver =
		 * new RemoteWebDriver(new URL(Node1), cap1); // Puts an Implicit //
		 * wait, // Will wait for 10 seconds before throwing // exception
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * 
		 * // Launch website driver.navigate().to("https://www.google.com");
		 * driver.manage().window().maximize();
		 * driver.get("https://www.google.com");
		 */
		// driver.quit();

	}
}
