import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxCustomProfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette", true);
//		WebDriver driver = new FirefoxDriver(capabilities);
		WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com/");
		
		

	}

}
