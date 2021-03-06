import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ClickAndHold {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new ChromeDriver(capabilities);
	    driver.get("http://web2.0calc.com/");
	    WebElement one = driver.findElement(By.id("Btn1")); 
	    WebElement two = driver.findElement(By.id("Btn2")); 
	    WebElement three = driver.findElement(By.id("Btn3")); 
	    WebElement plus = driver.findElement(By.id("BtnPlus")); //BtnCalc
	    WebElement equals = driver.findElement(By.id("BtnCalc"));
	    Actions builder = new Actions(driver);
//	    builder.clickAndHold(three).moveByOffset(120, 0).release(two).perform();
	    builder.clickAndHold(three).release(two).perform();
	    

}
}
