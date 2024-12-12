package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2facebook {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("dharanithiruvenkadaram@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("d@123");

}
}
