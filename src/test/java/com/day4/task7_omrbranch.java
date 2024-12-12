package com.day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task7_omrbranch {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		WebElement login = driver.findElement(By.xpath("//form[@id='userLogin']"));
		File file = login.getScreenshotAs(OutputType.FILE);
		File desfile= new File("C:\\Users\\DELL\\Desktop\\screenshots\\omr1.png");
		FileUtils.copyFile(file, desfile);
	}

}
