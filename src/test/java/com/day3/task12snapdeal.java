package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task12snapdeal {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com");
		WebElement txtmob = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		txtmob.click();
	}

}
