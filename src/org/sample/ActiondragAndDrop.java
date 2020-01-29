package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiondragAndDrop {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PonnyMaryTijo\\eclipse-workspace\\Selenium2020\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/drag_drop.html");
Actions ac=new Actions(driver);


WebElement srcBank=driver.findElement(By.id("credit2"));
WebElement destBank=driver.findElement(By.id("bank"));
ac.dragAndDrop(srcBank,destBank).perform();

WebElement srcSales=driver.findElement(By.id("credit1"));
WebElement destSales=driver.findElement(By.id("loan"));
ac.dragAndDrop(srcSales,destSales).perform();

WebElement srcBankValue=driver.findElement(By.xpath("//li[@data-id='2'][1]"));
WebElement destBankValue=driver.findElement(By.id("amt7"));
ac.dragAndDrop(srcBankValue, destBankValue).perform();

WebElement srcSalesValue=driver.findElement(By.xpath("//li[@data-id='2'][2]"));
WebElement destSalesValue=driver.findElement(By.id("amt8"));
ac.dragAndDrop(srcSalesValue, destSalesValue).perform();

	}

}
