import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GetText {

	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new ChromeDriver(capabilities);
		 driver.get("http://www.google.com");
		 WebElement searchButton = driver.findElement(By.className("jsb"));
		 System.out.println(searchButton.getText()); // incorrect

}
}