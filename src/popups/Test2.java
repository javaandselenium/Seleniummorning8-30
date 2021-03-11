package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/account/register/basicdetails");
		driver.findElement(By.xpath("//button[@title='I am a Professional']")).click();
driver.findElement(By.name("uploadCV")).sendKeys("C:\\Users\\QSP\\Documents\\Selenium 205\\Locators-w.docx");
	}

}
