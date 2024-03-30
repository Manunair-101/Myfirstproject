package day3_14032024;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	@BeforeSuite
	public void launchBrowser() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
	}
	
	@DataProvider(name="dataSet")
	public Object[][] mobiles()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="OnePlus";
		data[0][1]="11R";
		
		data[1][0]="Oppo";
		data[1][1]="Reno 2z";
		
		data[2][0]="iPhone";
		data[2][1]="15";
		
		return data;
		
	}
	
	@Test(dataProvider = "dataSet")
	public void flipkartSearchMobile(String brand, String model) throws InterruptedException
	{
		
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys(brand+" "+model);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

}
