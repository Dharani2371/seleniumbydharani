package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task8greens {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement btnint =  driver.findElement(By.xpath("//div[@id='heading201']"));
		btnint.click();
		WebElement btnres =  driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/Selenium_1and2yrs_Experience_Resume.pdf']"));
		btnres.click();
		
		
	}

}
