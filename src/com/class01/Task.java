package com.class01;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Task extends CommonMethods {

	/**TC 1: Swag Lab Title and Login Verification

	@BeforeMethod should contain navigation to the URL and title verification
	https://www.saucedemo.com/

	@Test should contain steps to login and “Product” word verification

	@AfterMethod should logOut from the application and close the browser
	  */
	
	@BeforeMethod
	public void setUP(){
		setUpDriver("chrome", "https://www.saucedemo.com/");	
	}
	
	@Test
	public void login() throws InterruptedException {
		sendText(driver.findElement(By.xpath("//*[@id=\"user-name\"]")), "standard_user");
		Thread.sleep(2000);
		sendText(driver.findElement(By.xpath("//*[@id=\"password\"]")), "secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]")).click();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
		}
}
