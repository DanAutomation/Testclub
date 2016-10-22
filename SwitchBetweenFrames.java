import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchBetweenFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://eur-lex.europa.eu/content/help/search/intro.html");
		
	      Actions action = new Actions(driver);
	      driver.switchTo().frame(0);
	            WebElement txt = driver.findElement(By.id("freetext"));
	            txt.sendKeys("I'm Frame One");
	      driver.switchTo().defaultContent();
	      driver.switchTo().frame(1);
	            txt = driver.findElement(By.id("freetextEditorial"));
	            txt.sendKeys("I'm Frame Two");

	}

}
