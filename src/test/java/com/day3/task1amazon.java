package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1amazon {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/\r\n");
		 WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		 txtsearch.sendKeys("iphone");
		 WebElement btnsearch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		 btnsearch.click();
		 
		
	}

}
