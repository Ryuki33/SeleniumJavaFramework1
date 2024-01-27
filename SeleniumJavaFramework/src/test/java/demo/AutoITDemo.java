package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoITDemo {

	public static void main(String[] args) throws Exception {
		uploadTest();
	}
	
	public static void uploadTest() throws Exception {
		//Setup Web Driver
		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Go to Site
		driver.get("https://tiiny.host/");
		
		//Click Upload button
		driver.findElement(By.cssSelector("button.mt-3.d-block.ps-4.pe-4.btn.btn-purple")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\wilso\\Documents\\FileUploadTest.exe");
		
		//Close the browser
		//driver.close();
		//driver.quit();
	}

}
