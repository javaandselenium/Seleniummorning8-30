package basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test5 {

	@Parameters({"browser"})
	@Test
	public void demo(String browsername) throws MalformedURLException{
		
		URL node=new URL("http://192.168.0.100:4444/wd/hub");
		DesiredCapabilities browser=new DesiredCapabilities();
		browser.setBrowserName(browsername);
		WebDriver driver=new RemoteWebDriver(node,browser);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("admin");

	}

}
