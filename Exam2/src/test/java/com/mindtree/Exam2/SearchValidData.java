package com.mindtree.Exam2;


import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchValidData {

	@Test
	public static void Test5() {
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		 driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("laptop table");
		search.sendKeys(Keys.ENTER);
	
	}

}
