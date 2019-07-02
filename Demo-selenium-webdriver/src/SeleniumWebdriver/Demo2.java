package SeleniumWebdriver;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(200);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click();
		
		if(driver.findElement(By.cssSelector("input[name='tripType'][value='roundtrip']")).isSelected())
		{
			driver.findElement(By.cssSelector("input[name='tripType'][value='oneway']")).click();
		}
		
		
		/*Select passengers = new Select(driver.findElement(By.name("passCount")));
		passengers.selectByIndex(2);*/
		
		WebElement DD = driver.findElement(By.name("passCount"));
		Select sel = new Select(DD);
		List<WebElement> data = sel.getOptions();
		System.out.println(data.size());
		sel.selectByIndex(2);
		for(int i = 0; i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
		}
		sel.selectByValue("2");	
		
		Select Departingfrom = new Select(driver.findElement(By.name("fromPort")));
		Departingfrom.selectByIndex(3);
		
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		
		driver.findElement(By.name("passFirst0")).sendKeys("Daniel");
		driver.findElement(By.name("passLast0")).sendKeys("Christie");
		driver.findElement(By.name("creditnumber")).sendKeys("1239 7989 7969");
		
		//Using for enhanced to select all check boxes (If we have same Attributes for 2 elements)
		List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
		/*for(WebElement e:checkbox)
		{
			e.click();
		}*/	
			
		//In case if we want to select a particular check box
		for(int i=0;i<1;i++)
		{
			WebElement tick = checkbox.get(1);
			tick.click();
		}
		
		
	}

	}

