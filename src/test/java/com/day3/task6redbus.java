package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task6redbus {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		WebElement btnaccc = driver.findElement(By.xpath("(//span[@class='name_rb_secondary_item'])[3]"));
		btnaccc.click();
		WebElement btnacc = driver.findElement(By.xpath("//li[@id='user_sign_in_sign_up']"));
		btnacc.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement txtphn = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		Thread.sleep(300);
		js.executeScript("argument[0].setAttribute('value','9342195536',)", txtphn);
	
		

	}

}
