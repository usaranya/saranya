package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Task\\driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
			driver.get("https://www.toolsqa.com/");
			driver.manage().window().maximize();
			WebElement s=driver.findElement(By.xpath("//p[contains(text(),'Amsterdam(NL)')]"));
			WebElement c=driver.findElement(By.xpath("//div[text()='Selenium Online Trainings']"));
			JavascriptExecutor jk=(JavascriptExecutor)driver;
			jk.executeScript("arguments[0].scrollIntoView(true)", s);
			Thread.sleep(3000);
			jk.executeScript("arguments[0].scrollIntoView(false)", c);
	}			
}
