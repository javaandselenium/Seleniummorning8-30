package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		
		System.out.println(allwin.size());

		String etitle="Jio";
		
		for(String b:allwin) {
			driver.switchTo().window(b);
			String atitle = driver.getTitle();
			System.out.println(atitle);
			
			if(atitle.equals(etitle)) {
				driver.close();
			}
		}
		
		
	}

}
