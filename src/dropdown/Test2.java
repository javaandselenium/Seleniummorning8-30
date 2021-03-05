package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		WebElement ele = driver.findElement(By.id("gh-cat"));
		Select s=new Select(ele);
		System.out.println(s.isMultiple());
		s.selectByIndex(4);
		Thread.sleep(3000);
		s.selectByValue("6000");
		Thread.sleep(3000);
		s.selectByVisibleText("Crafts");
		Thread.sleep(3000);
		s.deselectByIndex(4);
		driver.close();

	}

}
