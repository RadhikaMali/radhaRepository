package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClickMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe")	;
		//open browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//open url Actitime
		driver.get("http://127.0.0.1/login.do;jsessionid=2bo3dr0e1t1m1");
		
		
		//handle login page with valid input
	   driver.findElement(By.name("username")).sendKeys(args);
	   driver.findElement(By.name("pwd")).sendKeys(args);
	   driver.findElement(By.id("loginButton")).click();
	   
	   //home page
	   
	   //click on setting
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	
	}

}
