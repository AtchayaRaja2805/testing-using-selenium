package com.example.demo.sampletesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.navigate().to("https://j2store.net/free/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
	}
}
