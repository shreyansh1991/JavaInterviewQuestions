package webdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingNewTab {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("title 1 - " +driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement web = driver.findElement(By.xpath("//*[contains(text(),'Gmail')]"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(web).keyUp(Keys.CONTROL).build().perform();
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.CONTROL).build().perform();
		
		
		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("Gmail - Free"));
		System.out.println("wait over");
		
		System.out.println("title 2 - "+ driver.getTitle());
		
		
		
		driver.findElement(By.xpath("//*[text()[contains(.,'Create an')]]")).click();
		
	}
}
