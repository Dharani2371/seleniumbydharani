package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task8insta {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement txtid = driver.findElement(By.xpath("//input[@name='username']"));
	Thread.sleep(200);
	js.executeScript("argument[0].setAttribute('value','dharani,)", txtid);
	
}
}
