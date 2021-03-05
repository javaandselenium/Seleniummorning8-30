package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.id("cars"));
		
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("99");
		s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		System.out.println(s.isMultiple());
		
		if(s.isMultiple()) {
			Thread.sleep(2000);
			s.deselectByIndex(0);
			Thread.sleep(2000);
			s.deselectByValue("99");
			Thread.sleep(2000);
		//	s.deselectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		}
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
