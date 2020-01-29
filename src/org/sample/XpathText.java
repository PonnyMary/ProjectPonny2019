package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathText {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\PonnyMaryTijo\\eclipse-workspace\\Selenium2020\\Driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://wwww.facebook.com/");

 WebElement txtUser= driver.findElement(By.xpath("//input[contains(@type,'email')]"));
 txtUser.sendKeys("Greens");
 String attribute=txtUser.getAttribute("value");
 System.out.println(attribute);
 WebElement txtPass =driver.findElement(By.xpath("(//input[contains(@data-testid,'royal')])[2]"));
 txtPass.sendKeys("23455");
	
	WebElement btnforgotton=driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
	String text =btnforgotton.getText();
	System.out.println(text);
	btnforgotton.click();
	//driver.close();
			}

}

