package com.day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task6_facebook {
	public static void main(String[] args) throws IOException   {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		File desfile= new File("C:\\Users\\DELL\\Desktop\\screenshots\\fb1.png");
		FileUtils.copyFile(file, desfile);
		WebElement btnlogin = driver.findElement(By.name("login"));
		File file1 = btnlogin.getScreenshotAs(OutputType.FILE);
		File desfile1= new File("C:\\Users\\DELL\\Desktop\\screenshots\\fb2.png");
		FileUtils.copyFile(file1, desfile1);
		
		
				
	}

}
