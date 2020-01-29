package org.sample;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPrintOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PonnyMaryTijo\\eclipse-workspace\\Selenium2020\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement mon=driver.findElement(By.id("month"));
		
		   Select s=new Select(mon);
		   s.selectByValue("3");
		List<WebElement> li = s.getOptions();
		System.out.println(li.size());
		
		for (int i = 0; i < li.size(); i++) {
			WebElement x=li.get(i);
			String text=x.getText();
			 String v =x.getAttribute("value");

			System.out.println(text);
			System.out.println(v);
		}
		
		  for (WebElement x : li) { 
			  String at=x.getAttribute("value");
		  System.out.println(at); }
		   
		   
	}

}
