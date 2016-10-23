import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UploadFiles {
	
	public void sss(){
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("marionette", true);
		
		WebDriver driver = new ChromeDriver(capabilities);
//		driver.manage().window().maximize();
		driver.get("http://www.zamzar.com/");

//		uploadFile.click();
//		uploadFile.click();
//		driver.switchTo().window("File Upload");
//		
//		uploadFile.sendKeys("d://1.txt");



		 

//		driver.findElement(By.id("submit")).click();
		// driver.findElement(By.id("urid")).sendKeys("drive:\\path\\filename.extension");
//		driver.findElement(By.id("inputFile")).sendKeys("C:/path/to/file.jpg");

	}
	
	public static void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(stringSelection, null);
	}

	public void uploadFile() throws InterruptedException, AWTException {
//		 File file = new File("browsers//1.txt");
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("marionette", true);
		
		WebDriver driver = new ChromeDriver(capabilities);
//		driver.manage().window().maximize();
		driver.get("http://www.zamzar.com/");
		File file = new File("D:/1.txt");
		 driver.findElement(By.id("inputFile")).sendKeys(file.getAbsolutePath());  
//		 driver.findElement(By.id("inputFile")).click();	

			
			WebElement uploadFile = driver.findElement(By.id("inputFile"));
			//
			uploadFile.click();
			//
			setClipboardData(file.getAbsolutePath());
			//
			Robot robot = new Robot();
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_V);
			robot.delay(300);
			robot.keyRelease(KeyEvent.VK_V);
			robot.delay(300);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(300);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			robot.delay(300);
		}

	public static void main(String[] args) throws InterruptedException, AWTException {
		UploadFiles a = new UploadFiles();
//		a.sss();
		a.uploadFile();


	}

}
