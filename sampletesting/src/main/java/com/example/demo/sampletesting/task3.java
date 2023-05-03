package com.example.demo.sampletesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {
		public static void main(String[] args) throws InterruptedException
		{
			WebDriverManager.edgedriver().setup();
	        WebDriver driver=new EdgeDriver();
	        driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
	        driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Sadhana");
	        driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("727721euai043@skcet.ac.in");
	        driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Atchaya");
	        driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("727721euai009@skcet.ac.in");
	        driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
	        driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("HAPPY BIRTHDAY !");
	        Thread.sleep(5000);
	         WebElement amount=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
	         amount.click();
	         amount.clear();
	         amount.sendKeys("1000");
	        
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
	        Thread.sleep(2500);
	        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
	    }
}
