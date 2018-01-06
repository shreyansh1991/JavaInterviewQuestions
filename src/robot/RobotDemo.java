package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotDemo {
	static String chromepath = "C:\\Back Up\\My\\Testing Material\\Software\\chromedriver.exe";

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot robot = new Robot();
		//System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver = new FirefoxDriver();
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		StringSelection s = new StringSelection("Nike");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("end");
	}
}
