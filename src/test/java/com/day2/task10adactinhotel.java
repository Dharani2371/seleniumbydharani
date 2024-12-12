package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task10adactinhotel {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("dharanithiruvenkadaram");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("d@123");
	}

}
