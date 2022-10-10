package com.adactin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public final class Hotel_Booking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\durai\\\\eclipse-workspace\\\\prakash\\\\mini_project\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.name("username")).sendKeys("duraiprakash97");
		driver.findElement(By.name("password")).sendKeys("Palanisamy@1966");
		driver.findElement(By.name("login")).click();
		WebElement location = driver.findElement(By.name("location"));
		Select a = new Select(location);
		a.selectByIndex(2);
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select b = new Select(hotels);
		b.selectByVisibleText("Hotel Sunshine");
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select c=new Select(roomtype);
		c.selectByVisibleText("Standard");
		WebElement number = driver.findElement(By.id("room_nos"));
		Select d=new Select(number);
		d.selectByIndex(3);
		driver.findElement(By.id("datepick_in")).sendKeys("10/10/2022");
		driver.findElement(By.id("datepick_out")).sendKeys("12/10/2022");
		WebElement adult = driver.findElement(By.name("adult_room"));
		Select e=new Select(adult);
		e.selectByVisibleText("3 - Three");
		WebElement childroom = driver.findElement(By.name("child_room"));
		Select f=new Select(childroom);
		f.selectByVisibleText("1 - One");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.name("radiobutton_0")).click();
		driver.findElement(By.name("continue")).click();
		driver.findElement(By.name("first_name")).sendKeys("Durai");
		driver.findElement(By.name("last_name")).sendKeys("Prakash");
		driver.findElement(By.name("address")).sendKeys("No.1,GandhiNagar,Thanjur");
		driver.findElement(By.name("cc_num")).sendKeys("1234 1234 1234 1234");
		WebElement cardtype = driver.findElement(By.name("cc_type"));
		Select h=new Select(cardtype);
		h.selectByVisibleText("American Express");
		WebElement exDate = driver.findElement(By.name("cc_exp_month"));
		Select i=new Select(exDate);
		i.selectByVisibleText("March");
		WebElement exYear = driver.findElement(By.name("cc_exp_year"));
		Select j=new Select(exYear);
		j.selectByVisibleText("2022");
		driver.findElement(By.name("cc_cvv")).sendKeys("123");
		driver.findElement(By.id("book_now")).click();
		
	
		
		
		

		
		
		
		
		

	}

}
