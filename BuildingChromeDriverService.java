import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class BuildingChromeDriverService {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
	    ChromeDriverService.Builder builder =  new 
	    	      ChromeDriverService.Builder();
	    	    ChromeDriverService srvc = builder.usingDriverExecutable(new 
	    	      File("browsers//chromedriver.exe"))
	    	    .usingPort(65423).build();
	    	try {
	    	srvc.start();
	    	} catch (IOException e) {
	    	e.printStackTrace();
	    	}
	        WebDriver driver = new ChromeDriver(srvc);
	        driver.get("http://www.google.com");
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("Chrome Driver");

	}

}
