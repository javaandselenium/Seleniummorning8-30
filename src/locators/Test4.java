package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication");
driver.findElement(By.id("search_query_top")).sendKeys("dress");
driver.findElement(By.name("submit_search")).click();	
driver.findElement(By.xpath("(//a[@title='Printed Dress'])[2]")).click();
driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
	}

}
