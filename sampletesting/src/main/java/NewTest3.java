import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NewTest3 {
	
	WebDriver driver;
	//directory where output is to be printed
	ExtentSparkReporter spark = new ExtentSparkReporter("zreport.html");
	ExtentReports extent = new ExtentReports();
	static ExtentTest test;
	
	@BeforeMethod
	public void beforeTest() {
		extent.attachReporter(spark);
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();	
			
	}
	@Test
	public void TC_001() throws InterruptedException {
		test = extent.createTest("TC__001","Test case is positive");
		test.log(Status.PASS, "TC__001");
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin",Keys.ENTER);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
		 Thread.sleep(5000);
		 String url=driver.getCurrentUrl();
		 Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		 
		
	}
	@AfterMethod
	public void after1()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void afterTest() {
		extent.flush();
		
	}

}