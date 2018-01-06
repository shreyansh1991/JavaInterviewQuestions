package webdriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipDemo {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Shreyansh/Desktop/demo.html");
		WebElement web = driver.findElement(By.cssSelector("input[value='click']"));
		WebElement web2 = driver.findElement(By.id("id"));
		web.click();
		System.out.println(web2.getAttribute("validationMessage"));

		/*
		 * try { for (int i = 0; i < 2; i++) {
		 * 
		 * WebElement web2 = driver.findElement(By.id("id")); JavascriptExecutor
		 * js = (JavascriptExecutor) driver; String message = (String)
		 * js.executeScript("return arguments[0].validationMessage;", web2);
		 * System.out.println("ToolTip Using JS - " + message);
		 * System.out.println(web2.getAttribute("validationMessage"));
		 * 
		 * break; } } catch (Exception e) { System.out.println("Exception - " +
		 * e.getMessage()); }
		 */

	}
}
