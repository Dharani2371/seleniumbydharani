package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2resdbus {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement txtfrom =  driver.findElement(By.id("src"));
		txtfrom.sendKeys("Chennai");
		
		WebElement txtto =  driver.findElement(By.id("dest"));
		txtto.sendKeys("pollachi");
		
		}
}
