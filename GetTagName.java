import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GetTagName {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new ChromeDriver(capabilities);
	    driver.get("http://www.google.com/");
	    WebElement searchButton = driver.findElement(By.name("q")); 
	    WebElement searchButton1 = driver.findElement(By.name("btnK")); 
	    System.out.println(searchButton.getTagName());
	    System.out.println(searchButton1.getTagName());
	}
}
