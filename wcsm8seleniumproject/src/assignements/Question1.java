package assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Question1 {
	//How to close all Browsers

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.get("http://omayo.blogspot.com/");
		WebElement link = driver.findElement(By.linkText("open a popup wimdow"));

		Point point = link.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		//scrolling operation
		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
		
		Thread.sleep(2000);
		//click on link and get child window
		link.click();
		Thread.sleep(2000);
		
		// To close all the Browser
		driver.quit();


	}


}

