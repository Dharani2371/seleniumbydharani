package com.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task9_omrbranch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		JavascriptExecutor jsExecutor =(JavascriptExecutor)driver;		
		WebElement login = driver.findElement(By.xpath("//input[@id='inlineFormInputGroup']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",login);
		
		Thread.sleep(2000);
		WebElement section1 = driver.findElement(By.xpath("//h4[@class='section-heading mb-5']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(false);",section1);

	}

}
