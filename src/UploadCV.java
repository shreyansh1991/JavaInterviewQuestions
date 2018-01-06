import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadCV {
	public static WebDriver driver;

	public static void closeotherwindow(String mainwh) {
		Set<String> allWHS = driver.getWindowHandles();
		System.out.println("Size - " + allWHS.size());
		for (String wh : allWHS) {
			String title = driver.switchTo().window(wh).getTitle();

			if (title.equals("Amazon")) {

				driver.close();

			}
			driver.switchTo().window(mainwh);
		}
	}

	public static void uploadResume() throws InterruptedException {
		// driver.switchTo().window(driver.getWindowHandle());
		// Clicking on Login button
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();

		// driver.findElement(By.id("pWdgTab_login")).click();

		// Entering email id
		driver.findElement(By.id("eLogin")).sendKeys("ranjanvijayakumar@gmail.com");

		// Entering password
		driver.findElement(By.id("pLogin")).sendKeys("ranjan@9483514252");

		// clicking login button
		driver.findElement(By.xpath("//button[@class='blueBtn']")).click();

		// Clicking on Attach resume
		driver.findElement(By.xpath("//a[contains(text(),'Attached Resume')]")).click();

		// Clicking on Upload New Resume
		driver.findElement(By.id("uploadLink")).click();

		// Fetching CV from your system.
		driver.findElement(By.id("attachCV")).sendKeys("E:\\Resume\\Resume2\\Ranjan_3_years_Experience.docx");

		// Clicking on the save button.
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//button//b[text()='Save']")).click();

		// driver.findElement(By.className("w85bt fl")).click();
		driver.findElement(By.xpath("//button[@class='w85bt fl']")).click();
	}

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.gecko.driver","F://geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		String mainwindow = driver.getWindowHandle();
		closeotherwindow(mainwindow);
		uploadResume();
	}
}
