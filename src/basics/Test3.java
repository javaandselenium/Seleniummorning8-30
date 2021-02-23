package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException  {
System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
WebDriver driver =new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.myntra.com/");
Thread.sleep(3000);
driver.navigate().to("https://www.myntra.com/checkout/cart");
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().refresh();
Thread.sleep(3000);
driver.close();

	}

}
