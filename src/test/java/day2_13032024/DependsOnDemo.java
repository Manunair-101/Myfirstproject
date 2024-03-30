package day2_13032024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class MainMethod
{
	WebDriver driver;
	@Test
	public void launchBrowser() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
}


public class DependsOnDemo extends  MainMethod{
	
	@Test(dependsOnMethods = {"launchBrowser"})
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
