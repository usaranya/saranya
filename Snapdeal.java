import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Snapdeal {

		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\TestJava\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement s=driver.findElement(By.id("inputValEnter"));
		s.sendKeys("iphone6");
		WebElement b=driver.findElement(By.xpath("//span[text()='Search']"));
		b.click();
		WebElement c=driver.findElement(By.xpath("//p[text()='Apple iphone 6 ( 64GB , 1 GB ) Gold']"));
		c.click();
		WebElement a=driver.findElement(By.xpath("//span[text()='add to cart']"));
		a.click();
		
		
			
		}
		}



