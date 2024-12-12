package com.day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task8_omrbranch {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
	WebElement login = driver.findElement(By.xpath("//input[@id='inlineFormInputGroup']"));
	File file = login.getScreenshotAs(OutputType.FILE);
	File desfile= new File("C:\\Users\\DELL\\Desktop\\screenshots\\omr.png");
	FileUtils.copyFile(file, desfile);
}
}
