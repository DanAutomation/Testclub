import java.util.List;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstSelenium {
	


	@Before
	public void test(){


		System.setProperty("webdriver.gecko.driver", "browsers//chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
        driver.get("http://www.google.com/");
		
//		System.setProperty("webdriver.firefox.marionette", "browsers//chromedriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.google.com");
        // maximize the browser window
//	    WebElement searchBox = driver.findElement(By.name("q"));
//	    searchBox.sendKeys("learn webdriver");
//	    searchBox.submit();
	    WebElement searchBox = driver.findElement(By.id("lst-ib"));   
	    searchBox.sendKeys("learn webdriver");
	    searchBox.submit();
	}
        public static void main(String[] args) throws NullPointerException {
        	FirstSelenium a = new FirstSelenium();
        	a.test();

	}

}
