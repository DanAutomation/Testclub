package SeleniumFramework;

import java.security.SecureRandom;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeformFieldset {
	WebDriver driver;
	
	WebElement link;
	WebElement textarea;
	WebElement text;
	WebElement checkbox;
	WebElement radio;
	WebElement fromDateBox;
	Select dropdown;
	WebElement url;


	
	public PracticeformFieldset(WebDriver driver){
		this.driver = driver;
		driver.get("http://www.seleniumframework.com/Practiceform");

	}


	public void clickLink(){
		link = driver.findElement(By.linkText("This is a link"));
		System.out.println(driver.getCurrentUrl());
		link.click();
	}
	
    protected void isLoaded() {
        Assert.assertTrue(driver.getCurrentUrl().contains("Practiceform"));
        System.out.println("true");
    }
    
    public void inputDataInTextArea(){
    	textarea = driver.findElement(By.id("vfb-10"));
    	textarea.clear();
    	textarea.sendKeys(RandomStringUtils.randomAlphabetic(10) + "\n" + RandomStringUtils.randomNumeric(10));
    }
    
    public void inputText(){
    	text = driver.findElement(By.name("vfb-9"));
    	text.clear();
    	text.sendKeys(RandomStringUtils.randomAlphabetic(10));
    }
    
    public void checkBox(){
    	checkbox = driver.findElement(By.xpath("//*[@id='item-vfb-6']/div/span[2]"));
    	checkbox.click();

    }
    
    public void radio(){
    	radio = driver.findElement(By.xpath("//*[@id='item-vfb-7']/div/span[2]"));
    	radio.click();
    }
    
    public void dropdown(){
    	dropdown = new Select(driver.findElement(By.id("vfb-12")));
    	dropdown.selectByVisibleText("Option 3");
    }
    
    public void datapicker(){
    	fromDateBox= driver.findElement(By.id("vfb-8"));
//    	fromDateBox.clear();
//    	fromDateBox.sendKeys("08/08/2014");
    	List<WebElement> columns=fromDateBox.findElements(By.tagName("td"));

    	for (WebElement cell: columns){
    	   //Select 13th Date 
    	   if (cell.getText().equals("18")){
    	      cell.findElement(By.linkText("18")).click();
    	      break;
    	 }
    	}
    }
    
    public void url(){
    	url = driver.findElement(By.name("vfb-11"));
    	url.clear();
    	url.sendKeys("http://www.facebook.com");
    }

    
    
    public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "browsers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	PracticeformFieldset a = new PracticeformFieldset(driver);
//    	a.clickLink();
    	a.inputDataInTextArea();
    	a.inputText();
    	a.checkBox();
    	a.radio();
    	a.dropdown();
    	a.datapicker();
    	a.url();
    	
    }

}
