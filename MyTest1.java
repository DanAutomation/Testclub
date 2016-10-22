
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest1 { 
 //To open Firefox browser
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String  datentime = driver.findElement(By.className("date-header")).getText();//Locating element by className and store its text to variable datentime.
		System.out.print(datentime);
	}
 
 }