package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ttcsaxz {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D://Selenium//interviewquestions//javainterviewquestions//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
