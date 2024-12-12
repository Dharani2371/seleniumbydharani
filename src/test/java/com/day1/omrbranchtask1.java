package com.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class omrbranchtask1 {
public static void main(String[] args) throws InterruptedException {
		
		// browser launch
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		
//		//get title
//		
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		//currenturl	
//		
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		
		//maximizing the window
		driver.manage().window().maximize();
		
		WebElement txtemail =driver.findElement(By.id("email"));
		txtemail.sendKeys("gomathiteddy860@gmail.com");
		
		WebElement txtpassword =driver.findElement(By.id("pass"));
		txtpassword.sendKeys("Gomathi@1997");
		
		WebElement btnlogin = driver.findElement(By.xpath("//button[@value='login']"));
		btnlogin.click();
		
		Thread.sleep(3000);
		WebElement txtwelcome = driver.findElement(By.xpath("//a[contains(text(),'Welcome')]"));
		String text = txtwelcome.getText();
		System.out.println(text);
	
		
		//click hotel booking
		WebElement clickhotel = driver.findElement(By.xpath("(//div[@class='fliter_box_inner text-center'])[2]"));
		clickhotel.click();
		
		WebElement txtstate = driver.findElement(By.id("state"));
		Select s= new Select(txtstate);
		s.selectByValue("Karnataka");
		Thread.sleep(1000);
		WebElement txtcity = driver.findElement(By.xpath("//select[@id='city']"));
		Select s1= new Select(txtcity);
		s1.selectByValue("Bengaluru");
		Thread.sleep(1000);
		WebElement selectroomtype = driver.findElement(By.id("room_type"));
		Select s2= new Select(selectroomtype);
		s2.selectByValue("Deluxe");
		s2.selectByValue("Suite");
		s2.selectByValue("Luxury");
		s2.selectByValue("Studio");
		s2.selectByValue("Standard");
		
		Thread.sleep(1000);
		WebElement selectcheckin = driver.findElement(By.name("check_in"));
		selectcheckin.click();
		WebElement selectcheckindate = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[8]"));
		selectcheckindate.click();
		
		WebElement selectcheckout = driver.findElement(By.name("check_out"));
		selectcheckout.click();
		WebElement selectcheckoutdate = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[9]"));
		selectcheckoutdate.click();

		WebElement selectnoofrooms = driver.findElement(By.id("no_rooms"));
		Select s3= new Select(selectnoofrooms);
		s3.selectByValue("3");
		
		Thread.sleep(1000);
		WebElement selectnoofadults = driver.findElement(By.id("no_adults"));
		Select s4= new Select(selectnoofadults);
		s4.selectByValue("4");
		
		WebElement selectnoofchild = driver.findElement(By.id("no_child"));
		selectnoofchild.sendKeys("2");
		
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		WebElement clksubmit = driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
		clksubmit.click();
		
		driver.switchTo().defaultContent();
		WebElement selecthotel = driver.findElement(By.xpath("//h5[contains(text(),'Select')]"));
		String text2 = selecthotel.getText();
		System.out.println(text2);
		
		List<WebElement> hotelnames = driver.findElements(By.tagName("h5"));
		System.out.println("Hotel Names:");
        for (WebElement hotelElement : hotelnames) {
            System.out.println(hotelElement.getText());
        }
        
        List<WebElement> hotelprice = driver.findElements(By.tagName("h2"));
		System.out.println("Hotel prices:");
        for (WebElement hotelElement : hotelprice) {
            System.out.println(hotelElement.getText());
        }
        
		
	}


}



