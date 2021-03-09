package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		//Typecasting
		TakesScreenshot t=(TakesScreenshot)driver;
		//access the method store it in RAMlocation
		File src = t.getScreenshotAs(OutputType.FILE);
		//required location
		File dest=new File("./photo/amazon.png");
		//copy the ram to required loaction
		FileUtils.copyFile(src, dest);
		driver.close();

	}

}
