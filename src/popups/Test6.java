package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		System.out.println("before parent removal "+allwin.size());
		allwin.remove(parent);
		System.out.println("after parent removal "+allwin.size());
	
		for(String b:allwin) {
			driver.switchTo().window(b);
			//driver.close();
		}
		
		
	}

}
