package assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Taskformousehoveraction {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		driver.findElement(By.xpath()))
		

}
}