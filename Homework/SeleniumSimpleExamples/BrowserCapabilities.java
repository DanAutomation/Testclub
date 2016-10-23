

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserCapabilities {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		capabilities.setCapability("marionette", true);
//		WebDriver driver = new ChromeDriver(capabilities);
		Map capabilitiesMap = new HashMap();
		 capabilitiesMap.put("takesScreenShot", true);
		 DesiredCapabilities capabilities
		 = new DesiredCapabilities(capabilitiesMap);
		 WebDriver driver = new FirefoxDriver(capabilities);
		 driver.get("http://www.google.com");

	}

}
