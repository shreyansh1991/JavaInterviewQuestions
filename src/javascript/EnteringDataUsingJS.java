package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

public class EnteringDataUsingJS {
	public static void main(String[] args) {
		// System.setProperty("webdriver.gecko.driver", "D:/Selenium/Selenium
		// jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.navigate().to("https://facebook.com");
		// js.executeScript("document.getElementsByName('email')[0].value='shreyansh79';");
		/*
		 * WebElement web=driver.switchTo().activeElement();
		 * System.out.println(web.getAttribute("name"));
		 */
		js.executeScript("document.getElementById(\"pass\").value=\"simpledateformat\"");
		/*
		 * jse.executeScript(
		 * "document.getElementById('gbqfq').value = 'Ripon Al Wasim';");
		 */

		js.executeScript("arguments[0].click();", driver.findElement(By.id("u_0_l")));
		/* driver.quit(); */
		/*
		 * <input type="hidden" value="" name="body" id=":6b">
		 * 
		 * 
		 * jse.executeScript(
		 * "document.getElementsByName('body')[0].setAttribute('type', 'text');"
		 * );
		 * 
		 */

		js.executeScript("arguments[0].value='shreyansh79'", driver.findElement(By.xpath("//input[@id='email']")));

	}
}