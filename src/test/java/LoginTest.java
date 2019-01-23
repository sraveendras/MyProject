import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup(){
		
		System.setProperty("WebDriver.chrome.driver", "F:\\FrameworkProject\\MyProject\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);

	}
	
	
	@Test
	public void dologin(){
		
		driver.get("https://www.zoho.com/");
		driver.findElement(By.cssSelector(".zh-login")).click();
	}
	
	
	@AfterSuite
	public void closed(){
		
		driver.close();
	}

}
