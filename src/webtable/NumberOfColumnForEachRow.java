package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NumberOfColumnForEachRow {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("C:\\Users\\Shreyansh\\Desktop\\Codes\\SampleTable.html");

		List<WebElement> list = driver.findElements(By.xpath("html/body/table/tbody/tr"));
		for (int i = 2; i <= list.size(); i++) {
			List<WebElement> allcolumns = driver.findElements(By.xpath("html/body/table/tbody/tr[" + i + "]/td"));
			/*
			 * List<WebElement> allcolumns = list.get(i -
			 * 1).findElements(By.xpath("td"));
			 */
			System.out.println("Number of columns in " + (i - 1) + " data row is:" + allcolumns.size());
		}
	}
}