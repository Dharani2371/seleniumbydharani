package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task13myntra {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		WebElement txtmob = driver.findElement(By.xpath("//input[@type='tel']"));
		txtmob.sendKeys("9342195536");
		WebElement btnclick = driver.findElement(By.className("submitBottomOption"));
		btnclick.click();
	}

}
