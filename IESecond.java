import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IESecond {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "browsers//IEDriverServer.exe");
		DesiredCapabilities ieCapabilities =
			    DesiredCapabilities.internetExplorer();
			    ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
			      true);
			    WebDriver driver = new InternetExplorerDriver(ieCapabilities);
			    driver.get("http://www.google.com");

	}

}
