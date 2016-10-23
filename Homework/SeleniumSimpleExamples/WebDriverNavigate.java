import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverNavigate {
	  public static void main(String... args) {
			System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
//			System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			WebDriver driver = new FirefoxDriver(capabilities);
     		driver.navigate().to("http://www.google.com");
		    WebElement searchBox = driver.findElement(By.name("q"));
		    searchBox.sendKeys("Selenium WebDriver");
		    WebElement searchButton = driver.findElement(By.name("btnG"));
		    searchButton.click();
		    searchBox.clear();
		    searchBox.sendKeys("Packt Publishing");
		    searchButton.click();
		    driver.navigate().back();
		    driver.navigate().forward();
		    driver.navigate().refresh();
		  }
		}