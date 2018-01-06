package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintingHeaders {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("C:\\Users\\Shreyansh\\Desktop\\Codes\\SampleTable.html");

		List<WebElement> list = driver.findElements(By.xpath("html/body/table/tbody/tr[1]/th"));
		for (WebElement list1 : list) {
			System.out.println(list1.getText());
		}

	}
}
