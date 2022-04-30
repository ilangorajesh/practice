package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rember {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP PC\\eclipse-workspace\\Rember git\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("ilango");
	String title = driver.getTitle();
	System.out.println(title);
	
	
}
}
