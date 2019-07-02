package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://realestate.upskills.in/up-admin/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='http://realestate.upskills.in/my-profile/']")).click();
		driver.findElement(By.name("log")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		
		/*WebElement link = driver.findElement(By.id("menu-catalog"));
		Actions act = new Actions(driver);
		act.moveToElement(link).build().perform();
		act.click();*/
	}

}
