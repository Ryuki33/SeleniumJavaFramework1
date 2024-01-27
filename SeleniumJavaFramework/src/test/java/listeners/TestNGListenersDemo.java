package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import config.PropertiesDemo;

public class TestNGListenersDemo {

	@Test
	public void test1() {
		System.out.println("I am inside test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside test 2");
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Digital Electronics");
		driver.findElement(By.name("abcd")).sendKeys("Analog Electronics");
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside test 3");
		throw new SkipException("This test is skipped");
	}
}
