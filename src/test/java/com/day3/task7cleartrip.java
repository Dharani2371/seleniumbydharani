package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task7cleartrip {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		WebElement btnfrom =  driver.findElement(By.xpath("//input[@title='From station']"));
		btnfrom.sendKeys("chennai");
		WebElement btnto =  driver.findElement(By.xpath("//input[@title='To station']"));
		btnto.sendKeys("coimbatore");
		WebElement btnclass =  driver.findElement(By.xpath("//select[@class='required span span24']"));
		
		
		
		
		
}
}
