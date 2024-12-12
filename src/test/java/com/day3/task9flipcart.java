package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task9flipcart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement btnlog =  driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		btnlog.click();
		WebElement btnem =  driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		btnem.sendKeys("dharanithiruvenkadaram@gmail.com");
		WebElement btn =  driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']"));
		btn.click();
	}

}
