package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Sample {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
//	System.setProperty("webdriver.ie.driver","C:\\Users\\SADASIVUNISOWJANYA\\Pictures\\Camera Roll\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
//	WebDriver driver = new InternetExplorerDriver();
	driver.get("https://www.google.com/");

	driver.manage().window().maximize();


	WebElement sanjay=driver.findElement(By.name("q"));


	sanjay.sendKeys("selenium");

	sanjay.sendKeys(Keys.RETURN);

	//Thread.sleep(5000);
	driver.findElement(By.xpath("//h3[contains(text(),'Selenium - Web Browser Automation')]")).click();
	String currentURL = driver.getCurrentUrl();
	System.out.println(currentURL);

	}

}
