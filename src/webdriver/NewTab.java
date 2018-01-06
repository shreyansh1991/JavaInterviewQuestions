package webdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTab {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.in/");
	//driver.navigate().to(url);
	System.out.println(driver.getTitle());
	Actions actions=new Actions(driver);
	actions.keyDown(Keys.CONTROL).sendKeys("t").build().perform();
	System.out.println("end!");
}
}
