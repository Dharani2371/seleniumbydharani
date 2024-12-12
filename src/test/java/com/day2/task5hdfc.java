package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task5hdfc {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://netbanking.hdfcbank.com/");
	
	WebElement txtusername = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	txtusername.sendKeys("dharani");
}
}
