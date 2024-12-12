package com.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2_amazon {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement Txtsearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Txtsearch.sendKeys("iphone");
		WebElement clicksearch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clicksearch.click();
		WebElement firstprod = driver.findElement(By.xpath("(//a[contains(@class,'a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal')])[2]"));
		firstprod.click();
		
		
		
		
	}

}
