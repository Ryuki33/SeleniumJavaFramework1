package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("Google Search Test 1", "This is to test google search functionality");
		ExtentTest test2 = extent.createTest("Google Search Test 2", "This is to test google search functionality part 2");
		
		//Test Case 1
		//Setup Web Driver
		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Go to Google
		test1.log(Status.INFO, "Starting Test Case 1");
		driver.get("http://google.com");
		test1.pass("Successfully navigated to google.com");
		
		//Input on the search text field
		driver.findElement(By.name("q")).sendKeys("Digital Electronics");
		test1.pass("Successfully entered the keyword");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test1.pass("Successfully searched the keyword");
		
		//Close the browser
		test1.pass("Successfully closed the browser");
		
		test1.log(Status.INFO, "Closing the Test Case 1");
		
		extent.flush();
		
		//Test Case 2
		//Setup Web Driver	
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		//Go to Google
		test2.log(Status.INFO, "Starting Test Case 2");
		driver.get("http://google.com");
		test2.pass("Successfully navigated to google.com");
		
		//Input on the search text field
		driver.findElement(By.name("q")).sendKeys("Digital Electronics");
		test2.pass("Successfully entered the keyword");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test2.fail("Failed to search the keyword");
		
		//Close the browser
		test2.pass("Successfully closed the browser");
		
		test2.log(Status.INFO, "Closing the Test Case 2");
		
		extent.flush();
		
	}

}
