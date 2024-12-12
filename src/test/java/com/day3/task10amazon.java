package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task10amazon {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/\r\n");
		 WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		 txtsearch.sendKeys("iphone");
		 WebElement search=driver.findElement(By.id("nav-search-submit-button"));
		 search.click();
		 WebElement txtclick = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"));
		 txtclick.click();
	}


}
