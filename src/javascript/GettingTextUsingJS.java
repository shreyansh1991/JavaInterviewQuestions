package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettingTextUsingJS {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.navigate().to("https://facebook.com");
	WebElement webelement=driver.findElement(By.xpath("//*[contains(text(),'Create an account')]"));
	String s=js.executeScript("return arguments[0].textContent;", webelement).toString();
	String s1=js.executeScript("return arguments[0].innerText;", webelement).toString();
	String s2=js.executeScript("return arguments[0].innerHTML;", webelement).toString();
	
	System.out.println(s +" :  "+s1);
	System.out.println(s2);
	
}
}
