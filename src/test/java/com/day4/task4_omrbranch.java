package com.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task4_omrbranch {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		WebElement txtfirstname = driver.findElement(By.id("first_name"));
		WebElement txtsecondname = driver.findElement(By.id("last_name"));
		WebElement txtaddress = driver.findElement(By.xpath("//textarea[@class='form-control address']"));
		WebElement txtemail = driver.findElement(By.id("email"));
		WebElement txtphone = driver.findElement(By.id("phone"));
		WebElement rdbgender = driver.findElement(By.xpath("(//div[@class='form-check form-check-inline check-radio pl-0'])[2]"));
		WebElement ckbhobbies = driver.findElement(By.id("checkbox-movie"));
		WebElement ckbhobbies1 = driver.findElement(By.id("checkbox-cricket"));
		WebElement txtlanuguage = driver.findElement(By.xpath("//textarea[@class='select2-search__field']"));
		WebElement Selectskill = driver.findElement(By.xpath("//option[@value='Documentation']"));
		WebElement txtpassword = driver.findElement(By.id("password"));
		WebElement txtconformpassword = driver.findElement(By.id("confirm-password"));
	
		boolean enabled = txtfirstname.isEnabled();
		
		System.out.println(enabled);
		if (enabled==true) {
			txtfirstname.sendKeys("dharani");
			txtsecondname.sendKeys("t");
			txtaddress.sendKeys("chennai");
			txtemail.sendKeys("dharani@gmail.com");
			txtphone.sendKeys("0987654321");
			rdbgender.click();		
			ckbhobbies.click();
			ckbhobbies1.click();
			txtlanuguage.sendKeys("java");
			Selectskill.click();
			txtpassword.sendKeys("oiuytdsxcvbnm");
			txtconformpassword.sendKeys("oiuytdsxcvbnm");
			
				
			
		}else {
			System.err.println("not editable textbox...");
		}
	
	}

}
