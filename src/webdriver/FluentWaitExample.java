package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitExample extends Thread {
	static WebDriver driver = null;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[text()='Gmail']")).click();
		waitForPageLoad();
		Thread t = new Thread(new FluentWaitExample());
		t.start();
	}

	public static void waitForPageLoad() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withMessage("Page is not loaded in given Timeout")
				.withTimeout(60, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.NANOSECONDS)
				.ignoring(NoSuchElementException.class);
		wait.until(new Function<WebDriver,Boolean>() {

			@Override
			public Boolean apply(WebDriver arg0) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				String s = js.executeScript("return document.readyState").toString();
				System.out.println("Ready State -" + s);
				return js.executeScript("return document.readyState").equals("complete");
			}

		});

	}
}