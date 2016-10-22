import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class dragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new ChromeDriver(capabilities);
	    driver.get("http://web2.0calc.com/");
	    WebElement dragMe = driver.findElement(By.id("Btn1"));
	    WebElement dragMeToo = driver.findElement(By.id("Btn2"));
	    Actions builder = new Actions(driver);
	    builder.dragAndDrop(dragMe, dragMeToo).perform();
//	    builder.dragAndDropBy(dragMe, 300, 200).perform();
	    
	}
}
