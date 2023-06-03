package com.example.testing_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day_8four {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("Coimbatore");
		Thread.sleep(3000);
		WebElement datepick=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','30/06/2023')",datepick);
		
	}
}