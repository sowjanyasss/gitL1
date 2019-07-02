package SeleniumWebdriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("linda.anderson");
		String value = driver.findElement(By.id("txtUsername")).getAttribute("value");
		System.out.println(value);
		driver.findElement(By.id("txtPassword")).sendKeys("linda.anderson");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Performance")).click();
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement e:links)
		{
			String linktext = e.getText();
			System.out.println(linktext);
		}
		
		
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
//		String url = js.executeScript("return document.URL").toString();
//		System.out.println(url);
//		js.executeScript("document.getElementById('txtUsername').value = 'Admin'");
//		//js.executeScript("history.go(0)");
//		WebElement ele = (WebElement)js.executeScript("return document.getElementById('txtUsername')");
//		js.executeScript("document.querySelector('input#txtPassword').value = 'admin123'");
//		Thread.sleep(3000);
//		js.executeScript("document.getElementById('btnLogin').click()");
//		Thread.sleep(2000);
//		js.executeScript("document.getElementById('menu_pim_viewPimModule').click()");
//		Thread.sleep(3000);
//		js.executeScript("document.getElementById('menu_pim_viewEmployeeList').click()");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//		Thread.sleep(2000);
//		js.executeScript("document.getElementById('ohrmList_chkSelectRecord_4').scrollIntoView()");
//		//String tabledata = js.executeScript("return document.getElementById('resultTable').innerText").toString();
//		String tabledata = js.executeScript("return document.getElementById('resultTable').innerHTML").toString();
//		System.out.println(tabledata);
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
		
//		js.executeScript("window.history.back()");
//		Thread.sleep(2000);
//		js.executeScript("window.history.forward()");
//		js.executeScript("alert('Welcome to the session of Selenium')");
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		String value = ele.getAttribute("value");
		
		
	

	}

}
