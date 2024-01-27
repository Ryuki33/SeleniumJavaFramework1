package test;

import org.testng.annotations.Test;

import config.PropertiesDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestNG_Demo {
	
	WebDriver driver = null;
	public static String browser = null;

	@BeforeTest
	public void setUpTest() {
		//Setup Web Driver
		String projectPath = System.getProperty("user.dir");
		PropertiesDemo.getProperties();
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	
	@Test
	@Parameters({"searchValue"})
	public void googleSearch(@Optional("Data Science") String searchValue) throws InterruptedException {	
		//Go to Google
		driver.get("http://google.com");
		
		//Input on the search text field
		driver.findElement(By.name("q")).sendKeys(searchValue);
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void tearDownTest() {
		//Close the browser
		driver.close();
		driver.quit();
		System.out.print("Test ended successfully!");
		PropertiesDemo.setProperties();
	}

}
