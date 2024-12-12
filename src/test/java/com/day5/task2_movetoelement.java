package com.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class task2_movetoelement {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		
		WebElement courses = driver.findElement(By.xpath("//li[@class='dropdown courses d-flex align-items-center pl-3']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(courses).perform();
	}

}
