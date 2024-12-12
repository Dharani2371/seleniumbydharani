package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task4icici {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement txtusername = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
		txtusername.sendKeys("dharani");
		
		WebElement btn = driver.findElement(By.xpath("//img[@src='L001/consumer/images/../icici-login-update/img/goahead.png?mtime=1568465547000']"));
		btn.click();		
		
		
		WebElement username = driver.findElement(By.xpath("//input[@name='AuthenticationFG.USER_PRINCIPAL'][1]"));
		username.sendKeys("dharani");
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@type='password'][2]"));
		txtpass.sendKeys("dharani1234");
	}
}

