package assignements;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFlipkartwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[.='✕']"));
		driver.findElement(By.name("q")).sendKeys("samsung s23 ultra");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//handle of parent window
		String parentHandel = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']"));
		
		//handle of parent and child window
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			
			if(!parentHandel.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		
		else
		{
			
		
		}
	}
		
		
		
				
			
		
	}

}
