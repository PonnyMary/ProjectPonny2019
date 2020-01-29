package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lauch {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PonnyMaryTijo\\eclipse-workspace\\Selenium2020\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.get("http://www.greenstechnologys.com/");
//driver.get("http://www.gmail.com/");
//driver.get("http://www.flipkart.com/");
driver.get("http://greenstech.in/selenium-course-content.html");


String ti=driver.getTitle();
System.out.println(ti);
String url=driver.getCurrentUrl();
System.out.println(url);
//driver.quit(); 
	}

}
