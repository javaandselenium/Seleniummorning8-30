package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		
		FirefoxOptions f=new FirefoxOptions();
		f.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//a[text()='15']")).click();
	}

}
