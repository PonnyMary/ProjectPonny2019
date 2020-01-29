package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorredbus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PonnyMaryTijo\\eclipse-workspace\\Selenium2020\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	/*	driver.get("https://www.redbus.in/");
	WebElement txtFrom=driver.findElement(By.id("src"));
	txtFrom.sendKeys("Chennai");
	WebElement txtTo =driver.findElement(By.id("dest"));
	txtTo.sendKeys("Kochi"); */
		
	/*driver.get("htts://www.google.com/");
		WebElement txtSearch=driver.findElement(By.name("q"));
		txtSearch.sendKeys("GreensTechnology");
*/
		
	/*	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement txtuser=driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		txtuser.sendKeys("ponnym");
			WebElement txtpass =driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
			txtpass.sendKeys("acdffggvg"); */
		
		/*driver.get("https://www.swiggy.com/");
		WebElement txtlocation=driver.findElement(By.id("location"));
		txtlocation.sendKeys("chennai"); */
		
		/*driver.get("https://www.snapdeal.com/login");
		WebElement txtSearch=driver.findElement(By.id("userName"));
		txtSearch.sendKeys("89897973");*/
		driver.get("https://www.adactin.com/HotelApp");
		WebElement txtuser=driver.findElement(By.id("username"));
		txtuser.sendKeys("ponnym");
			WebElement txtpass =driver.findElement(By.id("password"));
			txtpass.sendKeys("acdffggvg"); 
		
		
		

	

		
	}

}
