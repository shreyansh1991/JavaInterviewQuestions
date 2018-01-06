package help;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class IRCTC {
	WebDriver driver;

	@Test
	public void windowHandle() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

		WebElement wbirctc = driver.findElement(By.id("irctc_tourism"));
		Actions ac = new Actions(driver);
		ac.moveToElement(wbirctc).perform();

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		driver.findElement(By.xpath("//a[text()='Tour Packages']")).click();

		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);

		System.out.println(s1.size());

		for (String child : s1) {
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);

				System.out.println(driver.getTitle());

				Thread.sleep(300);
				break;
			}

		}

		WebElement flightlink = driver.findElement(By.xpath("//a[text()='Flights']"));
		flightlink.click();

		Set<String> s2 = driver.getWindowHandles();
		System.out.println(s1);

		System.out.println("s2.size() - "+s2.size());

		for (String child1 : s2) {
			
				driver.switchTo().window(child1);
				if(driver.getTitle().contains("Low Fare Flight")){
					System.out.println(driver.getTitle());
					Thread.sleep(3000);
					WebElement linktrain = driver.findElement(By.xpath("//*[@id='bluemenu']/ul/li[1]/a"));
					linktrain.click();
					Thread.sleep(3000);
					Set<String> s3 = driver.getWindowHandles();
					System.out.println("s3.size -"+s3.size());
					for (String child2 : s3) {
						if (!parent.equalsIgnoreCase(child2)) {
							driver.switchTo().window(child2);
							System.out.println(driver.getTitle());
							driver.close();
						}
					}
					driver.switchTo().window(parent);
					driver.close();
				}
				

			
		}

	}

}
