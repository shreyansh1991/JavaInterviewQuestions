package webdriver;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentWait5 {
	private static WebDriver driver;
	private static String baseUrl;

	public static void main(String[] args) throws Exception {
		
		driver = new FirefoxDriver();
		baseUrl = "https://www.flipkart.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.navigate().to(baseUrl);
		// driver.findElement(By.cssSelector(".btn.btn-warning")).click();
		driver.findElement(By.cssSelector(".LM6RPg")).sendKeys("Moto G");

		/*
		 * // Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		 */ FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(30, TimeUnit.SECONDS);
		wait.pollingEvery(5, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);

		Function<WebDriver, WebElement> flag = new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				System.out.println("1");
				List<WebElement> element = driver.findElements(By.cssSelector("._2XvRSN"));
				System.out.println("size: " + element.size());
				for (WebElement ele : element) {
					System.out.println("inside");
					if (ele.getText().contains("moto g5 plus")) {
						ele.click();
						return ele;
					}
				}
				return null;

			}

		};
		wait.until(flag);
	}

}