package other;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HotStarInterviewQuestion {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.hotstar.com/movies/languages/english/");
		//driver.get("https://www.guru99.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(180,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//h3[contains(text(),'Miss March')]")));
		List<WebElement> list=driver.findElements(By.xpath("//a/div[2]/div/div/h3"));
		System.out.println("size - "+list.size());
	
		for(int i=0;i<list.size();i++)
		{
		System.out.println(list.get(i).getText());	
		}
	}
}
