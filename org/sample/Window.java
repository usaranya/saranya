package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
public static void main(String[] args) throws InterruptedException {

   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Task\\driver\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	WebElement e=driver.findElement(By.xpath("//input[@type='text']"));
	e.sendKeys("iphone7");
	Thread.sleep(3000);
	WebElement btn=driver.findElement(By.xpath("//button[@class='vh79eN']"));
	btn.click();
	Thread.sleep(3000);
	WebElement b=driver.findElement(By.xpath("//div[text()='Apple iPhone 7 (Silver, 128 GB)']"));
	b.click();
	Thread.sleep(3000);
	WebElement a=driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
	a.click();
}
}
