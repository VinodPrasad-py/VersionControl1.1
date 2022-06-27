package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testOne {
	
	public WebDriver driver;
	
    @BeforeTest
	public void setup() {
    	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	}
    
	@Test(priority=1)
	public void hitWebsite() {
		
		driver.get("https://demoqa.com/");
		String test = driver.findElement(By.xpath("//h5[text()='Elements']")).getText();
		Assert.assertEquals(test, "Elements");
		
	}
	
	@Test(priority=2)
	public void checkFormText() {
		
		String test = driver.findElement(By.xpath("//h5[text()='Forms']")).getText();
		driver.manage().window().maximize();
		Assert.assertEquals(test, "Forms");
	}
	
	@Test(priority=3)
	public void checkAlertsText() {
		
		String test = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).getText();
		Assert.assertEquals(test, "Alerts, Frame & Windows");
	}
	
	@Test(priority=4)
	public void checkWidgetsText() {
		
		String test = driver.findElement(By.xpath("//h5[text()='Widgets']")).getText();
		Assert.assertEquals(test, "Widgets");
	}	
	
	
	@Test(priority=5)
	public void checkInteractionsText() {
		
		String test = driver.findElement(By.xpath("//h5[text()='Interactions']")).getText();
		Assert.assertEquals(test, "Interactions");
	}	
	
	@Test(priority=6)
	public void closeTheBrowser() {
		
		driver.quit();
		
	}
	
}
