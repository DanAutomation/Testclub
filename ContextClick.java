import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ContextClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new ChromeDriver(capabilities);
	    driver.get("http://web2.0calc.com/");
	    WebElement three = driver.findElement(By.id("Btn3")); 
	    Actions builder = new Actions(driver);
		builder.moveToElement(three)
		.contextClick()
		.click(driver.findElement(By.name("Btn3")))
		.perform();

	}

}
