import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AboutLink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://www.google.com/");
		 WebElement aboutLink = driver.findElement(By.partialLinkText("��� ������!"));
				  aboutLink.click();

	}

}
