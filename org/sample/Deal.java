	package org.sample;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Deal {
	public static WebDriver driver;
	public static WebDriver launchBrowser(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Task\\driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get(url);
	return driver;
	}
	public static void fill(WebElement e,String value) {
		e.sendKeys(value);
	}
	public static void buttonClick(WebElement e) {
	e.click();
		}
	
	}







