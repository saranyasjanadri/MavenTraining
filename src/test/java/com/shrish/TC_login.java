package com.shrish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_login 
{

	@Test
	public void login_Test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    
	    
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	    
	    
	    Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	    
	    driver.close();
	    
	}
}
