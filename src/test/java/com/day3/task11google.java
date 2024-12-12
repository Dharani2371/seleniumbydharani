package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task11google {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement txtsearch = driver.findElement(By.xpath("//input[@id='firstName']"));
		txtsearch.sendKeys("dharani");
		WebElement search = driver.findElement(By.xpath("//input[@id='lastName']"));
		search.sendKeys("t");
		WebElement txtclick = driver.findElement(By.xpath("//span[@jsname='V67aGc']"));
		txtclick.click();

		Thread.sleep(5000);

		WebElement txtday = driver.findElement(By.xpath("//input[@name='day']"));
		txtday.sendKeys("23");
		
		WebElement txtyear = driver.findElement(By.xpath("//input[@id='year']"));
		txtyear.sendKeys("2001");

	}

}
