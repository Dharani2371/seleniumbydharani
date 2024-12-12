package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task6swiggy {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/city/chennai");
		
		WebElement btn = driver.findElement(By.xpath("//div[@class='style__SvgContainer-sc-btx547-2 bIINuK']"));
		btn.click();
		WebElement txtloc = driver.findElement(By.xpath("//input[@class='style__StyledInputBox-sc-gumzj9-3 fLqSlj']"));
		txtloc.sendKeys("pollachi");

}
}
