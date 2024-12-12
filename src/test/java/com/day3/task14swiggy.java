package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task14swiggy {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");

		WebElement btn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		btn.click();
		WebElement txtphn = driver.findElement(By.id("mobile"));
		txtphn.sendKeys("9876543210");
		WebElement btnlogin = driver.findElement(By.xpath("//a[@class='lyOGZ']"));
		btnlogin.click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement Txtotp = driver.findElement(By.id("otp"));
		js.executeScript("atgumet[0].SetAttribute('value','2345')", Txtotp);
		
		
	}

}
