package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionmoveToElement {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PonnyMaryTijo\\eclipse-workspace\\Selenium2020\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.greenstechnologys.com/");
Actions ac=new Actions(driver);

WebElement msccourse=driver.findElement(By.xpath("//a[text()='COURSES']"));
ac.moveToElement(msccourse).perform();

Thread.sleep(2000);

WebElement mscOracle=driver.findElement(By.xpath("//span[text()='Oracle Training']"));
ac.moveToElement(mscOracle).perform();

	}

}
