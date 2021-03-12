package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

driver.get("https://www.firstcry.com");
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
//  driver.switchTo().frame(0);
//  System.out.println("Frame");
 driver.findElement(By.xpath("//button[text()='Allow']")).click();
		 
 




	}

}
