package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		//WebElement ele = driver.findElement(By.id("gh-ac"));
		Demo d=new Demo(driver);
		driver.navigate().refresh();
		d.serach("book");
		//ele.sendKeys("book");
	}

}
