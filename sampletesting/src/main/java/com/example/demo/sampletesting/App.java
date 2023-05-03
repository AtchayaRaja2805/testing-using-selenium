package com.example.demo.sampletesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gbnull");
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Atchaya");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Raja");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727721euai009@skcet.ac.in");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("727721euai009");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
//        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
     }
}