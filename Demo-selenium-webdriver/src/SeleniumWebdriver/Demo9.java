package SeleniumWebdriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER)); // to open in new tab
		//multiple keyboard options click on multiple keyboard options or control
		
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		
	}

}
