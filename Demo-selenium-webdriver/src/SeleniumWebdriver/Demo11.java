package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C://Users//SADASIVUNISOWJANYA//Pictures//Camera%20Roll//janki2.html");
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]")).getText());
	}

}
