package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//enter the url
	driver.get("https://www.facebook.com/");
	
	//get the title of the application
	System.out.println(driver.getTitle());
	
	//get the url of the application
	System.out.println(driver.getCurrentUrl());
	
	//close the application
	driver.close();
	

	}

}
