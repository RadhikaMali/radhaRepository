package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpath4 {
	    //flipkart Launch
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver,","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//to popup handle
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//search box
		driver.findElement(By.name("q")).sendKeys("hp laptop");
		//search hp laptop
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']]")).click();
		//filtes
		
		








	}

}
