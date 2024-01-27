package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowser {

	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) {
		System.out.println("Browser is : "+browser);
		System.out.println("Thread ID is : "+Thread.currentThread().getId());
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	
	@Test
	public void test1() throws Exception {
		driver.get("http://google.com");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
