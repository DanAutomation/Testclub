import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new ChromeDriver(capabilities);
	    driver.get("http://www.google.com/");
	    Dimension searchButton = driver.findElement(By.name("q")).getSize();
	    System.out.println("width: " + searchButton.width);
	    System.out.println("height: " + searchButton.height);

	}

}
