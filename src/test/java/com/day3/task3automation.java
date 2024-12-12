package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3automation {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtfn = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'][1]"));
		txtfn.sendKeys("dhee");
		WebElement txtfl = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'][1]"));
		txtfl.sendKeys("rani");
		WebElement txtadd = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		txtadd.sendKeys("chennai");
		WebElement txtmail = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"));
		txtmail.sendKeys("dharani@gmail.com");
		WebElement txtphn = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']"));
		txtphn.sendKeys("0987654321S");
		WebElement txtfp=driver.findElement(By.id("firstpassword"));
		txtfp.sendKeys("dharani@123");
		WebElement txtsp=driver.findElement(By.id("secondpassword"));
		txtsp.sendKeys("dharani@123");
}

}
