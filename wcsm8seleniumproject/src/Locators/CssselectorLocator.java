package Locators;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssselectorLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
         ChromeOptions co=new ChromeOptions();
         co.addArguments("--remote-allow-origins=*");
       WebDriver driver = new ChromeDriver( co);
       driver.manage().window().maximize();
       driver.get("https://www.instagram.com/");
       Thread.sleep(2000);
       driver.findElement(By.name("username")).sendKeys("qwerty");
       Thread.sleep(2000);
       driver.findElement(By.name("passward")).sendKeys("abcdep");
       driver.findElement(By.cssSelector("button[class='acan _acap _acas _aj1-']")).click();
         
	}

}
