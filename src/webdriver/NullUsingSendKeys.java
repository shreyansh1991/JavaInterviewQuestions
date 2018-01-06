package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NullUsingSendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\ChromeDriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait;
		WebElement menu,submenu;
		driver.get("http://ecommerce.macomal.com/admin/login.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='l_email']")).sendKeys("admin@impexsupport.com");
		driver.findElement(By.xpath("//*[@id='l_password']")).sendKeys("adminadmin");
		driver.findElement(By.xpath("//*[@id='signin']")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("size - "+size);
		//driver.switchTo().frame(0);
		//System.out.println("frame");
		//WebElement generalmaster_drp=
		
		driver.findElement(By.xpath("//span[contains(text(),'General Masters')]")).click();
		//Select generalmaster=new Select(generalmaster_drp);
		//generalmaster.selectByVisibleText("Currency "); 
		
		/*wait = new WebDriverWait(driver, 30); 

		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/form/div[3]/div[1]/div/div[1]/section/div/div/ul/li[2]/a")));
		System.out.println("General Masters");
		menu=driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div/div[1]/section/div/div/ul/li[2]/a")); //AP Transactions

		submenu=driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div/div[1]/section/div/div/ul/li[2]/ul/li[1]/a")); //Invoice Entry List*/
		

		

	}

}
