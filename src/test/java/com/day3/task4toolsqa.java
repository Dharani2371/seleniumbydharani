package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task4toolsqa {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form ");
		driver.manage().window().maximize();
		
		WebElement txtfirst = driver.findElement(By.xpath("//input[@id='first-name']"));
		txtfirst.sendKeys("dharanithiru");
		
		WebElement txtlast = driver.findElement(By.xpath("//input[@id='last-name']"));
		txtlast.sendKeys("t");
		
		WebElement txtmail = driver.findElement(By.xpath("//input[@id='email']"));
		txtmail.sendKeys("dharanithiru@gmail.com");
		
		WebElement txtmob = driver.findElement(By.xpath("//input[@id='mobile']"));
		txtmob.sendKeys("0987654321");
		
		WebElement txtcity = driver.findElement(By.xpath("//input[@id='city']"));
		txtcity.sendKeys("chennai");
		
		WebElement txtmsg = driver.findElement(By.xpath("//textarea[@class='upcoming__registration--input']"));
		txtmsg.sendKeys("t");
	}
	

}
