package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Snapdeal1 extends Deal {
	public static void main(String[] args) {
		launchBrowser("https://www.snapdeal.com/");
		WebElement s=driver.findElement(By.id("inputValEnter"));
		fill(s,"iphone6");
		WebElement b=driver.findElement(By.xpath("//span[text()='Search']"));
		buttonClick(b);
		WebElement c=driver.findElement(By.xpath("//p[text()='Apple iphone 6 ( 16GB , 1 GB ) Silver']"));
		buttonClick(c);
		
	}
	}

