package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;
import pages.GoogleSearchPage2;

public class Test3_GoogleSearch {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
	}

	public static void googleSearch() {
		//Setup Web Driver
		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		//Go to Google
		driver.get("http://google.com");
		
		//Input on the search text field
		GoogleSearchPage2 googleSearchPage = new GoogleSearchPage2(driver);
		googleSearchPage.setTextInSearchBox("Ethical Hacking");
		googleSearchPage.clickSearchButton();
		System.out.print("Test Successful!");
		
		//Close the browser
		//driver.close();
	}
}
