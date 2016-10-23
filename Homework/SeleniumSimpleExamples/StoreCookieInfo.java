import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StoreCookieInfo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//operadriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new ChromeDriver(capabilities);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.facebook.com");
	    driver.findElement(By.id("email")).sendKeys("daniilzuyev@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("29042012thebest");
	    driver.findElement(By.id("u_0_l")).click();
	    driver.findElement(By.id("pass")).submit();
	    File f = new File("opera.data");
	    try{
	         f.delete();
	         f.createNewFile();
	         FileWriter fos = new FileWriter(f);
	         BufferedWriter bos = new BufferedWriter(fos);
     for(Cookie ck : driver.manage().getCookies()) {
	       bos.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
	    bos.newLine();
	      }
	         bos.flush();
	         bos.close();
	         fos.close();
	     }catch(Exception ex){
	         ex.printStackTrace();
	     }

	}

}
