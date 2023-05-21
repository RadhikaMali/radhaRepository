package MethodsOFWebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class closeAllBrowsers {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe")
		WebDriver driver=new ChromeDriver(co);				
		driver.manage().window().maximize();
	    driver.get("http://omayo.blogspot.com/");
	    
}
}