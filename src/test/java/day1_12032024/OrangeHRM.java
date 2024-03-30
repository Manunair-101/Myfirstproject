package day1_12032024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	@Test(priority = 1)
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Test(priority = 2)
	public void verifyDashboard()
	{
		String d=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		/*if(dash.equals("Dashboard"))
		{
			System.out.println("Succesful Login");
		}
		else
		{
			System.out.println("Fails to Land on Dashboard");
		}*/
		
		Assert.assertEquals(d, "Dasboard");
	}
	
	@Test(priority = 3)
	public void logout()
	{
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
		
	}
}
