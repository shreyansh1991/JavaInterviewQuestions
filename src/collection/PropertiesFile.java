package collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	static Properties p = null;

	PropertiesFile() throws FileNotFoundException, IOException {
		p = new Properties();
		File f = new File(
				System.getProperty("user.dir") + File.separator + "config" + File.separator + "config.properties");
		p.load(new FileInputStream(f));
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		new PropertiesFile().readPropertyFile("browser");
		new PropertiesFile().writeToPropertyFile("browser");
		new PropertiesFile().readPropertyFile("browser");
	}

	public static void readPropertyFile(String key) {
		String browserValue = p.getProperty(key);
		System.out.println(browserValue);

	}

	public static void writeToPropertyFile(String key) throws IOException {
		FileOutputStream fo = new FileOutputStream(
				System.getProperty("user.dir") + File.separator + "config" + File.separator + "config.properties");
		p.setProperty("browser", "IE");
		p.setProperty("browser1", "IE1");
		p.setProperty("browser2", "IE2");
		p.store(fo, null);
	}
}
