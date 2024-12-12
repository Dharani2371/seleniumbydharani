package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task5greeentect {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		btn.click();
		
		WebElement btncts = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/interview-questions/cts.pdf#toolbar=0']"));
		btncts.click();
		
	}

}
