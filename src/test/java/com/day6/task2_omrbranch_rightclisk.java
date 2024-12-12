package com.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task2_omrbranch_rightclisk {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
		
		WebElement rightclick = driver.findElement(By.xpath("(//button[@class='btn bld mb-4'])[3]"));
		Actions actions= new Actions(driver);
		Thread.sleep(2000);
		actions.contextClick(rightclick).perform();
	}

}
