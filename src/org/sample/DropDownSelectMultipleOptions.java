package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelectMultipleOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PonnyMaryTijo\\eclipse-workspace\\Selenium2020\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement mon=driver.findElement(By.id("continentsmultiple"));
		
	Select s=new Select(mon);
	boolean b=s.isMultiple();
	System.out.println(b);
	s.selectByValue("EU");

	s.selectByIndex(4);
	s.selectByVisibleText("Antarctica");
		
		  List<WebElement> op = s.getOptions(); 
		  for (int i = 0; i < op.size(); i++) {
		  WebElement x=op.get(i); 
		  String text=x.getText(); 
		  s.selectByVisibleText(text);
		  
		  }
		 
		  
		  s.deselectByValue("EU");
		  s.deselectByIndex(4);
		  s.deselectByVisibleText("Antarctica");
		  List<WebElement> all = s.getAllSelectedOptions(); 

		  for (WebElement x : all) { 
			  String at=x.getText();
		  System.out.println(at); }
		  WebElement fir=s.getFirstSelectedOption();
		  String text=fir.getText();
		  System.out.println(text);
		  
		  
		  
		  
		
	}
	

}
