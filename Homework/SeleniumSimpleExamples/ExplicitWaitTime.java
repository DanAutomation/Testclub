import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new ChromeDriver(capabilities);
	      driver.get("http://www.google.com");
	      WebElement element = (new WebDriverWait(driver, 20)).until(new 
	ExpectedCondition<WebElement>() { 
	         @Override
	         public WebElement apply(WebDriver d) {
	            return d.findElement(By.name("q"));
	         }
	         

	});

}
}
