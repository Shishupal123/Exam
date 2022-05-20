package com.mindtree.Exam;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Order {

	@Test
	public static void Test3() {
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("chairs");
		 driver.findElement(By.xpath("//button[@id='search_button']")).click();
		 driver.findElement(By.xpath("//div[@class='product-title product-title-sofa-mattresses']")).click();
		 String currentHandle=driver.getWindowHandle();
		 Set<String> handles = driver.getWindowHandles();
		 for(String actual: handles)
		 {
			 if(!actual.equalsIgnoreCase(currentHandle))
			 {
				 //Switch to the opened tab
				 driver.switchTo().window(actual);
				 //opening the URL saved.
				 driver.get("https://www.urbanladder.com/products/hathwin-outdoor-chair?sku=FVODCH61BK14966&src=subcat");
			 }
		 }
		 driver.findElement(By.xpath("//button[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//button[@id='checkout-link']")).click();
		 driver.findElement(By.xpath("//input[@id='order_email']")).click();
		 driver.findElement(By.xpath("//input[@id='order_email']")).sendKeys("Shishudabrase21697@gmail.com");
		 driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_zipcode']")).click();
		 driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_zipcode']")).sendKeys("500016");
		 driver.findElement(By.xpath("//textarea[@id='order_ship_address_attributes_address1']")).click();
		 driver.findElement(By.xpath("//textarea[@id='order_ship_address_attributes_address1']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_firstname']")).click();
		 driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_firstname']")).sendKeys("Shishupal");
		 driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_lastname']")).click();
		 driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_lastname']")).sendKeys("Dabrase");
		 driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_phone']")).click();
		 driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_phone']")).sendKeys("9373967336");
		 driver.findElement(By.xpath("//input[@id='address-form-submit']")).click();	 	 
		 
	}

}
