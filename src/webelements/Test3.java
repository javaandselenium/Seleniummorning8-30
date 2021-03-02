package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	 WebElement ele = driver.findElement(By.id("username"));
Dimension s = ele.getSize();
System.out.println("HEIGHT "+s.getHeight());
System.out.println("width "+s.getWidth());
driver.close();
	}

}
