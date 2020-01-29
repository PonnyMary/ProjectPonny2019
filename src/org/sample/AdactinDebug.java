package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinDebug {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PonnyMaryTijo\\eclipse-workspace\\Selenium2020\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
		WebElement txtusername=driver.findElement(By.id("username"));
		txtusername.sendKeys("ponnymary");
		WebElement txtPassword=driver.findElement(By.id("password"));
		txtPassword.sendKeys("adactin123$");
	//	Thread.sleep(1000);
		WebElement btnLogin=driver.findElement(By.id("login"));
		btnLogin.click();
		WebElement loc=driver.findElement(By.id("location"));
		   Select sl=new Select(loc);
		   sl.selectByValue("Sydney");
		   WebElement htls=driver.findElement(By.id("hotels"));
		   Select shtls =new Select(htls);
		   shtls.selectByValue("Hotel Creek");
		   WebElement roomtype=driver.findElement(By.id("room_type"));
		   Select sroomtype =new Select(roomtype);
		   sroomtype.selectByValue("Double");
		   WebElement txtdatepickin =driver.findElement(By.id("datepick_in"));
		   txtdatepickin.sendKeys("15/01/2020");
		   WebElement txtdatepickout =driver.findElement(By.id("datepick_out"));
		   txtdatepickout.sendKeys("17/01/2020");
		   
		   WebElement adulroom=driver.findElement(By.id("adult_room"));
		   Select sadulroom =new Select(adulroom);
		   sadulroom.selectByValue("3");
		   WebElement childroom=driver.findElement(By.id("child_room"));
		   Select schildroom =new Select(childroom);
		   schildroom.selectByValue("4");
		   WebElement btnSubmit=driver.findElement(By.id("Submit"));
			btnSubmit.click();
			
		WebElement btnRadio1=driver.findElement(By.id("radiobutton_0"));
		btnRadio1.click();

	
	}

}
