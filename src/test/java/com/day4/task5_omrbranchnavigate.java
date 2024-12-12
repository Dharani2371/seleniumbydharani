package com.day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class task5_omrbranchnavigate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com");
		Navigation n = driver.navigate();
		n.to("https://www.facebook.com");
		Thread.sleep(5000);
		n.back();
		Thread.sleep(5000);
		n.forward();
		Thread.sleep(5000);
		n.refresh();
	}

}
