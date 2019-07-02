package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		/*WebElement label  = driver.findElement(By.xpath("//label[@for='email']")); // or xpath can be //table/tbody/tr[1]/td[1]
		System.out.println(label.getText()); to get the text of a particular attribute*/
		
		System.out.println(driver.findElement
		(By.xpath("//input[@name='email']//parent::td//parent::tr//preceding-sibling::tr//td/label")).getText());

		/*Writing xpath using parent and child
		//input[@name='email']//parent::td//following-sibling::td//input[@name='pass'] -- for password
		//input[@name='pass']//parent::td//following-sibling::td//input[@value='Log In'] -- for login
*/		
		
	}

}
