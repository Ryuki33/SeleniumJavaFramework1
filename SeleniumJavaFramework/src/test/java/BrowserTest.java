import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) { 	
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		
//		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Wilson");
//		WebElement googleInputBox = driver.findElement(By.id("APjFqb"));
//		googleInputBox.sendKeys("Wilson");
		//driver.close();
	}

}
