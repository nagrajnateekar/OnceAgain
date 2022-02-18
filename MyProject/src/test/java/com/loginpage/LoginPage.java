
package com.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//@Ignore
//@Test
//@Listeners(com.loginpage.CustomListners1.class)
public class LoginPage {
	
	public static WebDriver driver;
	@BeforeClass
	public void lauching() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
	}
	
	@Test(priority=1,description="username keys")
	public void userName() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}
	@Test(priority=2,description="password keys")
	public void password() {
		driver.findElement(By.id("password1")).sendKeys("secret_sauce");

	}
	//@Ignore // alternative of @Test(enabled=false)
	@Test(priority=3,description="clicking on butoon")
	public void button() {
		driver.findElement(By.id("login-button")).click();
		Assert.assertEquals("Swag Labs", driver.getTitle());
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
