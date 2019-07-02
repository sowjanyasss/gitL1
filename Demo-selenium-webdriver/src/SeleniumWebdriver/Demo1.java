package SeleniumWebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String Expectedtitle = "OrangeHRM";
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//driver.findElement(By.id("btnLogin")).click(); or
		driver.findElement(By.cssSelector("input#btnLogin")).click(); 
		// for cssSelector we can use class or id # for id and . for class
		
		String Actualtitle = driver.getTitle();
		
		if(Expectedtitle.equals(Actualtitle))
		{
			System.out.println("If the title is same then logout");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id= 'welcome']")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Logout")).click(); // or xpath as "//*[@'welcome-menu']/ui/li[2]/a"
			driver.close();
		}
		else{
			System.out.println("Title is not same");
		}
			
		/*driver.close();//It will close only that current instance of the browser i.e to close the current window 
		driver.quit();//to close the entire browser*/
		
	}

}
