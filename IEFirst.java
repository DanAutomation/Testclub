import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEFirst {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "browsers//IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
//		WebDriver driver = new FirefoxDriver(capabilities);
		WebDriver driver = new InternetExplorerDriver(capabilities);
	    driver.get("http://www.google.com");

	}

}
