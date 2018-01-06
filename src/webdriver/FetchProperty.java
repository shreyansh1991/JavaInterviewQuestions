package webdriver;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.joox.JOOX.*;

public class FetchProperty {

	/**
	 * @param args
	 */
	private WebDriver driver;
	// private DriverService service;

	public void run() {

		driver = null;
		// Set Browser
		// FirefoxProfile fp = new FirefoxProfile();
		// fp.setAcceptUntrustedCertificates(true);
		// fp.setPreference("start-maximized", true);
		// DesiredCapabilities capibilities = null;
		//
		// capibilities = DesiredCapabilities.firefox();
		// capibilities.setCapability(FirefoxDriver.PROFILE, fp);
		driver = new FirefoxDriver();

		driver.navigate().to("http://www.Globallogic.com");

		ArrayList attributes;
		// List<WebElement> elements = driver.findElements(By.xpath("//*"));
		List<WebElement> elements = driver
				.findElements(By.cssSelector("header.main-header nav.main-nav div.logo a img"));
		for (WebElement element : elements) {
			attributes = (ArrayList) ((JavascriptExecutor) driver).executeScript(
					"var s = []; var attrs = arguments[0].attributes; for (var l = 0; l < attrs.length; ++l) { var a = attrs[l]; s.push(a.name + ':' + a.value); } ; return s;",
					element);
			// attributes =
			// (Object[])((JavascriptExecutor)driver).executeScript("document.getElementsByTagName("+"*"+");
			// ");
			System.out.println(element.getTagName() + " ID: " + element.getAttribute("id") + " Class :"
					+ element.getAttribute("class") + " CSS: " + element.getCssValue("*"));
			for (Object o : attributes) {
				System.out.println("ATTR: " + o);
			}
		}

	}

	public void run_DOM() {

		driver = null;
		driver = new FirefoxDriver();

		driver.navigate().to("http://www.Google.com");

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		Document HTML_document = null;
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			HTML_document = builder.parse(new InputSource(new StringReader(driver.getPageSource())));
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Element element = null;
		String parentClassNodeName = "";
		Node lastClassNode = null;
		String parentCss = ""; // String to prepend to current css
		HashMap<String, HashMap<String, String>> objRepository = new HashMap<String, HashMap<String, String>>();

		NodeList nodeList = HTML_document.getElementsByTagName("*");
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node n = nodeList.item(i);
			if (n.getNodeType() == Node.ELEMENT_NODE) {

				element = (Element) n;

				// save into ObjRepository
				objRepository.put(element.getTagName(), new HashMap<String, String>());
				objRepository.get(element.getTagName()).put("id", element.getAttribute("id"));
				objRepository.get(element.getTagName()).put("name", element.getAttribute("name"));
				objRepository.get(element.getTagName()).put("class", element.getAttribute("class"));
			//	objRepository.get(element.getTagName()).put("xpath", $(element).xpath());
				if (element.getTagName().equalsIgnoreCase("a") && element.getNodeType() == Node.TEXT_NODE) {
					objRepository.get(element.getTagName()).put("text", element.getNodeValue());
					if (element.getNodeValue().split(" ").length >= 3) {
						objRepository.get(element.getTagName()).put("partialtext",
								element.getNodeValue().split(" ")[0] + " " + element.getNodeValue().split(" ")[1]);
					} else if (element.getNodeValue().split(" ").length > 3) {
						objRepository.get(element.getTagName()).put("partialtext",
								element.getNodeValue().split(" ")[0] + " " + element.getNodeValue().split(" ")[1] + " "
										+ element.getNodeValue().split(" ")[2]);
					}
				}
				// Debug
				// if (lastClassNode != null) {
				// System.out.println(" parentClassNode :" + parentClassNodeName
				// + " LastClassNode" + ((Element)lastClassNode).getNodeName()
				// );
				// } else {
				// System.out.println(" parentClassNode :" +
				// parentClassNodeName);
				// }
				if ((!parentClassNodeName.isEmpty() && !checkAncesstor(element, parentClassNodeName))
						|| parentClassNodeName.matches("html|body")) {
					parentClassNodeName = "";
					parentCss = "";
				}

				Node temp = lastClassNode;
				Node temporary = null;
				if (!parentClassNodeName.isEmpty() && !checkAncesstor(element, temp.getNodeName())) {
					while (!checkAncesstor(element, temp.getNodeName())) {
						temporary = temp;
						temp = temp.getParentNode();
					}
					lastClassNode = temp;
					//// Debug
					// System.out.println("Updating lastClass Node: " +
					//// lastClassNode.getNodeName());
					// System.out.println("lastClassNode: "+
					//// lastClassNode.getNodeName());
					parentCss = objRepository.get(lastClassNode.getNodeName()).get("css");
					//// Debug
					// System.out.println("Setting parentCss: "+ parentCss);
				}

				if (parentClassNodeName.isEmpty() && !element.getAttribute("class").isEmpty()) {
					// CASE 1: No Parent class | have class in current node
					//// Debug
					// if (lastClassNode != null) {
					// System.out.println(" Class:
					//// "+element.getAttribute("class")+"===="+element.getAttribute("class").split("
					//// ").length + " LastCssParent" +
					//// lastClassNode.getNodeName());
					// } else {
					// System.out.println(" Class:
					//// "+element.getAttribute("class")+"===="+element.getAttribute("class").split("
					//// ").length);
					// }
					if (element.getAttribute("class").split(" ").length > 1) {
						objRepository.get(element.getTagName()).put("css",
								element.getTagName() + "." + element.getAttribute("class").split(" ")[1]);
					} else {
						objRepository.get(element.getTagName()).put("css",
								element.getTagName() + "." + element.getAttribute("class").split(" ")[0]);
					}
					parentClassNodeName = element.getTagName();
					lastClassNode = n;
					//// Debug
					// System.out.println("Setting css :"+
					//// objRepository.get(element.getTagName()).get("css") + "
					//// ParentClassNode: "+ parentClassNodeName
					// +" lastClassNode: "+lastClassNode.getNodeName());
				} else if (parentClassNodeName.isEmpty() && (element.getAttribute("class").isEmpty())) {
					// CASE 2: No Parent class with No class in current node
					if (element.getAttribute("id").isEmpty()) {
						// CASE 2a: No Parent class | No class | No Id in
						// current node
						objRepository.get(element.getTagName()).put("css", parentCss + " " + element.getTagName());
						//// Debug
						// System.out.println("Setting css2 :"+
						//// objRepository.get(element.getTagName()).get("css")
						//// + " ParentClassNode: "+ parentClassNodeName
						// + " LastClassNode" + lastClassNode.getNodeName());
					} else {
						// CASE 2b: No Parent class | No class | have Id in
						// current node
						objRepository.get(element.getTagName()).put("css",
								parentCss + " " + element.getTagName() + "#" + element.getAttribute("id"));
						//// Debug
						// System.out.println("Setting css3 :"+
						//// objRepository.get(element.getTagName()).get("css")
						//// + " ParentClassNode: "+ parentClassNodeName
						// + " LastClassNode" + lastClassNode.getNodeName());
					}
				} else if (!parentClassNodeName.isEmpty() && !(element.getAttribute("class").isEmpty())) {
					// CASE 3: Parent class with class in current node
					//// Debug
					// System.out.println(" Class:
					//// "+element.getAttribute("class")+"===="+element.getAttribute("class").split("
					//// ").length);
					if (element.getAttribute("class").split(" ").length > 1) {
						objRepository.get(element.getTagName()).put("css", parentCss + " " + element.getTagName() + "."
								+ element.getAttribute("class").split(" ")[1]);
					} else {
						objRepository.get(element.getTagName()).put("css", parentCss + " " + element.getTagName() + "."
								+ element.getAttribute("class").split(" ")[0]);
					}
					lastClassNode = n;
					//// Debug
					// System.out.println("Setting css4: " +
					//// objRepository.get(element.getTagName()).get("css") + "
					//// ParentClassNode: "+ parentClassNodeName
					// + " LastClassNode" + lastClassNode.getNodeName());
				} else if (!parentClassNodeName.isEmpty() && (element.getAttribute("class").isEmpty())) {
					// Parent class | No class in current node
					if (element.getAttribute("id").isEmpty()) {
						// Parent class | No class | No Id in current node
						objRepository.get(element.getTagName()).put("css", parentCss + " " + element.getTagName());
						//// Debug
						// System.out.println("Setting css5: " +
						//// objRepository.get(element.getTagName()).get("css")
						//// + " ParentClassNode: "+ parentClassNodeName
						// + " LastClassNode" + lastClassNode.getNodeName());
					} else {
						// Parent class | No class | have Id in current node
						objRepository.get(element.getTagName()).put("css",
								parentCss + " " + element.getTagName() + "#" + element.getAttribute("id"));
						//// Debug
						// System.out.println("Setting css6: " +
						//// objRepository.get(element.getTagName()).get("css")
						//// + " ParentClassNode: "+ parentClassNodeName
						// + " LastClassNode" + lastClassNode);
					}

				}

				// if (! element.getTagName().equalsIgnoreCase("div") && !
				// css.isEmpty()) {
				// //Parent is Div
				// thisIsNotDiv = true;
				// if (!element.getAttribute("class").isEmpty()){
				// css = css + "." + element.getAttribute("class");
				// } else if (!element.getAttribute("class").isEmpty()){
				// css = css + "#" + element.getAttribute("class");
				// } else {
				// css = css + " " + element.getTagName();
				// }
				// } else {
				// //
				// }

				if (element.getTagName().equalsIgnoreCase("a") && element.getNodeType() == Node.TEXT_NODE) {
					System.out.println("Element: " + element.getTagName() + " | ID "
							+ objRepository.get(element.getTagName()).get("id") + " | Name "
							+ objRepository.get(element.getTagName()).get("name") + " | Class "
							+ objRepository.get(element.getTagName()).get("class") + " | Text "
							+ objRepository.get(element.getTagName()).get("text") + " | Partial Text "
							+ objRepository.get(element.getTagName()).get("partialtext") + " | XPath "
							+ objRepository.get(element.getTagName()).get("xpath") + " | CSS "
							+ objRepository.get(element.getTagName()).get("css"));
				} else {
					System.out.println("Element: " + element.getTagName() + " | ID "
							+ objRepository.get(element.getTagName()).get("id") + " | Name "
							+ objRepository.get(element.getTagName()).get("name") + " | Class "
							+ objRepository.get(element.getTagName()).get("class") + " | XPath "
							+ objRepository.get(element.getTagName()).get("xpath") + " | CSS "
							+ objRepository.get(element.getTagName()).get("css"));
				}
				if (!parentClassNodeName.isEmpty()) {
					parentCss = objRepository.get(element.getTagName()).get("css");
					//// Debug
					// System.out.println("parentCss: "+ parentCss);
				}
			}
		}
		driver.close();
	}

	/*
	 * This function will check if the Parameter2(String) is ancesstor of
	 * Parameter1 return true if it is an ancesstor else false
	 */
	private boolean checkAncesstor(Element element, String parentNode) {
		//// Debug
		// System.out.print("Checking Ancesstor of: "+element.getTagName() + "
		//// to be: "+parentNode);
		// System.out.println(" Parent Node is:
		//// "+((Element)element).getParentNode().getNodeName());

		while (!element.getNodeName().equalsIgnoreCase("html")) {
			// display, log or do what you want with element
			if (((Element) element).getParentNode().getNodeName().equalsIgnoreCase(parentNode)) {
				//// Debug
				// System.out.println("Parent Node is: Equal to"+parentNode);
				return true;
			}
			element = (Element) element.getParentNode();
		}
		return false;
	}

	public static void main(String[] args) {
		FetchProperty test = new FetchProperty();
		test.run_DOM();
	}
}
