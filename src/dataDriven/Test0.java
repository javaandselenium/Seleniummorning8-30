package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Properties p=new Properties();
		
		p.load(new FileInputStream("./data.properties"));
		
		driver.get(p.getProperty("url"));
		
		driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
	driver.findElement(By.id("pass")).sendKeys(p.getProperty("password"));
	
	}

}
