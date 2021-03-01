package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,5);
//		WebElement ele = driver.findElement(By.id("username"));
//		w.until(ExpectedConditions.visibilityOf(ele)).sendKeys("admin");
w.until(ExpectedConditions
		.visibilityOfElementLocated(By.id("username"))).sendKeys("admin");	
	
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
//		WebElement ele1 = driver.findElement(By.xpath("//div[text()='Login ']"));
//	    w.until(ExpectedConditions.elementToBeClickable(ele1)).click();
	    
	w.until(ExpectedConditions.
			elementToBeClickable(By.xpath("//div[text()='Login ']"))).click();   
	

		
		String actualtitle = driver.getTitle();
		w.until(ExpectedConditions.titleContains("ghfghfghfgh"));
	    System.out.println(actualtitle);
	}

}
