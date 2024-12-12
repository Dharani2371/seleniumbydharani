package com.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1_omr_movetoelement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		WebElement btnstring = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement txtclass = driver.findElement(By.xpath("//li[@class='placeholder']"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(btnstring, txtclass).perform();
		
		Thread.sleep(5000);
		WebElement btnlist = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement txtinteface = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions actions1=new Actions(driver);
		actions1.dragAndDrop(btnlist, txtinteface).perform();
		
		Thread.sleep(5000);
		WebElement btnaction= driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement txtclass1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions actions2=new Actions(driver);
		actions2.dragAndDrop(btnaction, txtclass1).perform();
		
		Thread.sleep(3000);
		WebElement btnweb = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement txtinterface1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		Actions actions3=new Actions(driver);
		actions3.dragAndDrop(btnweb, txtinterface1).perform();
	}

}
