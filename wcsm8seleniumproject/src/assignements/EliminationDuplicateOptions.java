package assignements;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EliminationDuplicateOptions {
	
	

	public static  void main(String[] args,
			WebElement dropDown) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Admin/Desktop/Web%20Elements/single%20select%20staticDropdown.html");
		WebElement dropdown= driver.findElement(By.name("menu"));
		
		//to handle dropDown create object of select class
		Select sel=new Select(dropDown);
		
		//to get all the options from dropDown
		List<WebElement> = sel.getOptions();
		
		//to eliminate the duplicates and mantain the order of insertion we use 
		TreeSet<String>	ts =new TreeSet<string>();
		
		//to read the list by eliminating duplicates
		for(inti=0;i<alloptions.size();i++);
		{
			//get the options and test of options

			String op=alloptions.get(i).getText();
			//add the text of options Treeset
			ts.add(op);
		}
		//to rad the options from set 
		for(string optipons:ts)
		{
			Thread.sleep(2000);
			System.out.println(options);
		}




	}





}
}
