package com.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3_omrbranch {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.omrbranch.com/javatraininginchennaiomr");
	WebElement Txt = driver.findElement(By.xpath("//div[@class='col-md-9 box-div']"));
	Txt.click();
	boolean selected = Txt.isSelected();
	System.out.println(selected);
	String content = Txt.getText();
    System.out.println(content);

 }
}
