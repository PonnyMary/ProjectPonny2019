package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class lauchIEbrowser {

	public static void main(String[] args) {
System.setProperty("webdriver.ie.driver", "C:\\Users\\PonnyMaryTijo\\eclipse-workspace\\Selenium2020\\Driver\\IEDriverServer.exe");
		

        WebDriver driver = new InternetExplorerDriver();
      driver.get("http://www.greenstechnologys.com/");
       // driver.get("http://demo.automationtesting.in/Register.html");
        //driver.get("http://greenstech.in/selenium-course-content.html");
        
     //  driver.get("https://www.amazon.in");
//        driver.get("https://www.facebook.in");

        String ti=driver.getTitle();
        System.out.println(ti);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        //driver.quit(); 

	}

}
