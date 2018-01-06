package webdriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class WaitForDownloadFile {
	public static String downloadPath = "D:\\seleniumdownloads";

	@Test
	public void testDownload() throws Exception {
		WebDriver driver = new FirefoxDriver(FirefoxDriverProfile());
		driver.manage().window().maximize();
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
		driver.findElement(By.linkText("smilechart.xls")).click();

		System.out.println("Below is the mechanism to wait till download is not completed....");

		waitforFileDownload("D:\\seleniumdownloads\\smilechart.xls", driver);

		// System.out.println(b);

	}

	public static FirefoxProfile FirefoxDriverProfile() throws Exception {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.download.dir", downloadPath);
		profile.setPreference("browser.helperApps.neverAsk.openFile",
				"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.download.manager.focusWhenStarting", false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		profile.setPreference("browser.download.manager.closeWhenDone", false);
		return profile;
	}

	public static void waitforFileDownload(String file, WebDriver driver) throws InterruptedException {
		FluentWait<WebDriver> wait = new FluentWait(driver);
		wait.withTimeout(5, TimeUnit.SECONDS);
		wait.pollingEvery(1, TimeUnit.SECONDS);
		wait.ignoring(FileNotFoundException.class);

		Function<WebDriver, Boolean> flag = new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				boolean b = false;
				File fileExist = new File(file);
				if (fileExist.exists()) {
					System.out.println("File downloaded successfully!");
					b = true;
					// b=true;
					return b;
				} else {
					System.out.println("Still Waiting...");
				}
				return b;

			}

		};
		wait.until(flag);
		
		
		
		
		  
		
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withMessage("Page is not loaded in given Timeout")
				.withTimeout(60, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.NANOSECONDS)
				.ignoring(NoSuchElementException.class);
		wait.until(new Function<WebDriver, Boolean>() {

			@Override
			public Boolean apply(WebDriver arg0) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				String s = js.executeScript("return document.readyState").toString();
				System.out.println("Ready State ---> " + s);
				return js.executeScript("return document.readyState").equals("complete");
			}

		});

	}	
		

	}*/
	
	
	
}

}