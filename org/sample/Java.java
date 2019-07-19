package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Java extends Base {
public static void main(String[] args) {
	launchBrowser("https://www.facebook.com/");
	title("Facebook");
	WebElement user=driver.findElement(By.id("email"));
	fill(user,"usarany230");
	WebElement p=driver.findElement(By.id("pass"));
	fill(p,"12345asd");
	WebElement b=driver.findElement(By.id("loginbutton"));
	buttonClick(b);
	
}
}