package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNG_Demo2 {
	
	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		//Setup Web Driver
		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearch2() throws InterruptedException {	
		//Go to Google
		driver.get("http://google.com");
		
		//Input on the search text field
		driver.findElement(By.name("q")).sendKeys("Digital Electronics");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
	}
	
	@Test
	public void googleSearch3() throws InterruptedException {	
		//Go to Google
		driver.get("http://google.com");
		
		//Input on the search text field
		driver.findElement(By.name("q")).sendKeys("Digital Electronics");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void tearDownTest() {
		//Close the browser
		driver.close();
		driver.quit();
		System.out.print("Test ended successfully!");
	}

}
