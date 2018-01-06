package webdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShiftTab {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");

		Actions actions = new Actions(driver);
		for (int i = 0; i < 9; i++)
			actions.sendKeys(Keys.TAB).build().perform();
		System.out.println("yo");
		Thread.sleep(2000);
		
		actions.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).build().perform();

		/*
		 * Always Remember that we can only use modifier keys with keydown and
		 * /keyup method.
		 * 
		 */
		
		
		

	}
}


