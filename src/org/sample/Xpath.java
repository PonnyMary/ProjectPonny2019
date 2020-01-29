package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PonnyMaryTijo\\eclipse-workspace\\Selenium2020\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtuser=driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[1]"));
		txtuser.sendKeys("ponny@gmail.com");
		WebElement txtpass =driver.findElement(By.xpath("(//input[@data-testid='royal_pass'])"));
		txtpass.sendKeys("dsds2");
		WebElement btnLogin =driver.findElement(By.xpath("(//input[@value='Log In'])"));
		btnLogin.click();

	}

}
