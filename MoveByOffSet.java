import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MoveByOffSet {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new ChromeDriver(capabilities);
	    driver.get("http://web2.0calc.com/");
	    WebElement three = driver.findElement(By.id("Btn3")); 
	    System.out.println("X coordinate: "+three.getLocation().getX()+"; Y coordinate: "+three.getLocation().getY());
        Actions builder = new Actions(driver);
        builder.moveByOffset(three.getLocation().getX()+1, three.getLocation().getY()+1);
        builder.perform();
	}

}
