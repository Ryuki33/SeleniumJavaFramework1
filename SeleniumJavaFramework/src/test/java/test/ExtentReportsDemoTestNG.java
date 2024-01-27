package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemoTestNG {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test1;
	ExtentTest test2;
	WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		//Setup Extent Report
		htmlReporter = new ExtentHtmlReporter("extentReports.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//Setup Web Driver
		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	}
	
	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void test1() {
		test1 = extent.createTest("Google Search Test 1", "This is to test google search functionality");
		
		//Go to Google
		test1.log(Status.INFO, "Starting Test Case 1");
		driver.get("http://google.com");
		test1.pass("Successfully navigated to google.com");
		
		//Input on the search text field
		driver.findElement(By.name("q")).sendKeys("Digital Electronics");
		test1.pass("Successfully entered the keyword");
		
		//Enter the search keyword
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test1.pass("Successfully searched the keyword");
		
		test1.pass("Successfully closed the browser");	
		test1.log(Status.INFO, "Closing the Test Case 1");
	}
		
	@Test
	public void test2() {
		test2 = extent.createTest("Google Search Test 2", "This is to test google search functionality");
		
		//Go to Google
		test2.log(Status.INFO, "Starting Test Case 2");
		driver.get("http://google.com");
		test2.pass("Successfully navigated to google.com");
		
		//Input on the search text field
		driver.findElement(By.name("q")).sendKeys("Analog Electronics");
		test2.pass("Successfully entered the keyword");
		
		//Enter the search keyword
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test2.pass("Successfully searched the keyword");
		
		test2.pass("Successfully closed the browser");	
		test2.log(Status.INFO, "Closing the Test Case 2");
	}
	
	@AfterTest
	public void tearDownTest() {
		//Close the Browser
		driver.close();
	}
	
	@AfterSuite
	public void tearDown() {
		//Quit the browser
		driver.quit();
		
		//Creating Extent Report
		extent.flush();
	}

}
