package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.id("username"));
         if(ele.isDisplayed()) {
        	 System.out.println("Pass:element is dispalyed");
         }
         else
         {
        	 System.out.println("Fail:element is not dispalyed");
         }
         
         Thread.sleep(3000);
         WebElement btn = driver.findElement(By.xpath("//div[text()='Login ']"));
	if(btn.isEnabled()) {
		System.out.println("Pass:element is enabled");
	}
	else
	{
		System.out.println("Fail:element is not enabled");
	}
	WebElement ch = driver.findElement(By.id("keepLoggedInCheckBox"));
	if(ch.isSelected()) {
		System.out.println("pass:element is selected");
	}
	else
	{
		System.out.println("Fail:element is not selected");
	}
	driver.close();
	}

}
