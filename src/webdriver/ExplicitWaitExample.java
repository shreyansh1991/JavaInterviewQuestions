package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {
	static WebDriver driver = null;

	public static void main(String[] args) {
		driver = new FirefoxDriver();

		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[text()='Gmail']")).click();
		waitForPageLoad();
	}

	public static void waitForPageLoad() {
		new WebDriverWait(driver, 60).until(new ExpectedCondition() {

			@Override
			public Boolean apply(Object arg0) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				String s = js.executeScript("return document.readyState").toString();
				System.out.println("Ready State -" + s);
				return js.executeScript("return document.readyState").equals("complete");
			}

		});
	}
}
