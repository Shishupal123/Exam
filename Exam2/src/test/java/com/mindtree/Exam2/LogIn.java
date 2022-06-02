package com.mindtree.Exam2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LogIn {

	@Test
	public static void Test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		 Thread.sleep(2000L);
		 driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
		 WebDriverWait wait=new WebDriverWait(driver,20);
		 WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='email required input_authentication']")));
		 ele.sendKeys("Shishudabrase21697@gmail.com");
		 WebElement ele2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='required input_authentication']")));
		 ele2.sendKeys("786786@aiBABA124592");
		 WebElement ele3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='button primary']")));
		 ele3.click();
		 WebElement ele4 = driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']"));
		 Actions as = new Actions(driver);
		 as.moveToElement(ele4).perform();
		 driver.findElement(By.xpath("//a[@href='/profile']")).click();
		 
		 
	}

}