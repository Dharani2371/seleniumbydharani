package com.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1_omrbranch_doubleclick {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
		
		WebElement doubleclick = driver.findElement(By.xpath("(//button[@class='btn bld mb-4'])[2]"));
		Actions actions= new Actions(driver);
		actions.doubleClick(doubleclick).perform();
	}

}
