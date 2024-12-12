package com.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1_omrbranch {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/javatraininginchennaiomr");
		WebElement txtElement = driver.findElement(By.xpath("//strong[contains(text(),'Classroom Training, Corp')]"));
		txtElement.click();
		driver.manage().window().maximize();
	}

}
