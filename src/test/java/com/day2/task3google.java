package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3google {
public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("GreensTechnology");
	}

}
