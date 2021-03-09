package scrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		WebElement ele = driver.findElement(By.xpath("(//img[@class='product-image'])[6]"));
         Point loc = ele.getLocation();
         int x = loc.getX();
         int y = loc.getY();
         
         JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("window.scrollBy("+x+","+y+")");
         
         ele.click();
         
         
         
         
         
		
	}

}
