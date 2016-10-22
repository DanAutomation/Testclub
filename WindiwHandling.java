import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindiwHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://web2.0calc.com/");
		String window1 = driver.getWindowHandle();
		System.out.println("First window handle is: " + window1);
		 WebElement link = driver.findElement(By.id("Btn1"));
		 link.click();
		 String window2 = driver.getWindowHandle();
	      System.out.println("Number of Window Handles so for: " + driver.getWindowHandles().size());
	driver.switchTo().window(window1);
	}
}
