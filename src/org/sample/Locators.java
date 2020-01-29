package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PonnyMaryTijo\\eclipse-workspace\\Selenium2020\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtuser=driver.findElement(By.id("email"));
		txtuser.sendKeys("ponny@gmail.com");
		WebElement txtpass =driver.findElement(By.name("pass"));
		txtpass.sendKeys("dsds2");
	//WebElement, WebDriver ---interfaces -fully abstraction/onlyabstract methods
	}

}
