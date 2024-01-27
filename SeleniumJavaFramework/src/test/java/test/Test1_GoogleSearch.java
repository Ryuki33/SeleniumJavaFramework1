package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
	}
	
	public static void googleSearch() {
		//Setup Web Driver
		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Go to Google
		driver.get("http://google.com");
		
		//Input on the search text field
		driver.findElement(By.name("q")).sendKeys("Digital Electronics");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		System.out.print("Test Successful!");
		
		//Close the browser
		driver.close();
		driver.quit();
	}

}
