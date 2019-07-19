package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Task\\driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
	       driver.get("https://www.toolsqa.com/automation-practice-table/");
		   driver.manage().window().maximize();
		   List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		   for(int i=0;i<1;i++) {
		   WebElement r = tRows.get(i);
		   System.out.println(r);
		   List<WebElement> tData = driver.findElements(By.tagName("th"));
				for(int j=0;j<tData.size();j++) {
					WebElement d = tData.get(j);
					String s = d.getText();
					System.out.println(s);}
					
					}}}
					
			//List<WebElement> tRows = driver.findElements(By.tagName("tr"));
			//for(int i=0;i<tRows.size();i++) {
				//WebElement r = tRows.get(i);
				//System.out.println(r);
				//List<WebElement> tData = driver.findElements(By.tagName("td"));
				//for(int j=0;j<tData.size();j++) {
					//WebElement d = tData.get(j);
					//String s = d.getText();
					//System.out.println(s);
//}}
				
				
			
					
			
			
