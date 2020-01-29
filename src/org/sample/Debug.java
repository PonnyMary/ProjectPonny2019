package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PonnyMaryTijo\\eclipse-workspace\\Selenium2020\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession&cid=1&navigationDirection=forward");
		WebElement txtuser=driver.findElement(By.id("identifierId"));
		txtuser.sendKeys("ryantijo@gmail.com");
		WebElement btnNext=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		btnNext.click();
				
		WebElement txtpass =driver.findElement(By.xpath("//input[@name='password']"));
		txtpass.sendKeys("123456");
		/*WebElement btnNext1 =driver.findElement(By.name("pass"));
		btnNext1.click();*/
	
	}

}
