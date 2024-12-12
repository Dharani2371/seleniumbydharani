package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1facebook {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("dharanithiruvenkadaram@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("d@123");
		
		

	}

}
