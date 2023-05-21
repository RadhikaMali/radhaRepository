package assignements;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class que12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://omayo.blogspot.com/");

		WebElement link = driver.findElement(By.linkText("Open a popup window"));

		org.openqa.selenium.Point 
		point = link.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();

		// Scrolling Operation
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
		Thread.sleep(2000);

		// click on link and get child window 
		link.click();
		Thread.sleep(2000);

		// To close ALL the browser
		driver.quit();



	}

}
