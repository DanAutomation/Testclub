import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ImplictWaiteTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new ChromeDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver.get("http://www.google.com");

	}

}
