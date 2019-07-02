package SeleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(200);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click();
		
		/*driver.findElement(By.linkText("Car Rentals")).click();
		String title = driver.getPageSource();
		System.out.println(title);*/
		
		String UnderconsTitle = "Under Construction: Mercury Tours";
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		String[] linkTexts = new String[linkElements.size()];
		int i=0;
		
		//Extract the link text of each link element
		for(WebElement e: linkElements)
		{
			linkTexts[i] = e.getText();
			i++;
		}
		
		//For testing each link
		for(String t : linkTexts)
	{
			Thread.sleep(2000);
		    driver.findElement(By.linkText(t)).click();
				if(driver.getTitle().equals(UnderconsTitle))
			{
				System.out.println("\"" + t + "\t" + "is under construction.");
			} else
			{
				System.out.println("\"" + t + "\t" + "is working.");
			}
			driver.navigate().back();
		}
driver.quit();
	}

}
