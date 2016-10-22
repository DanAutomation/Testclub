import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEThird_host_name {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "browsers//IEDriverServer.exe");
		InternetExplorerDriverService.Builder builder 
	      = new InternetExplorerDriverService.Builder();
	    InternetExplorerDriverService srvc = 
	      builder.usingPort(5555).withHost("127.0.0.1").build();
	    DesiredCapabilities ieCapabilities = DesiredCapabilities
	      .internetExplorer();
	    ieCapabilities.setCapability(
	    InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
	    WebDriver driver = new InternetExplorerDriver(srvc,ieCapabilities);
	    driver.get("http://www.google.com");

	}

}
