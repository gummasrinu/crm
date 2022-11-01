package practicestest;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MyFristScript {
	public static void main (String args[]) throws InterruptedException  {
		WebDriver driver =WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/venkat/Desktop/main.html");
		Thread.sleep(3000);
		driver.findElement(By.id("t2")).sendKeys("fdsifsadfjg");
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(element);
		//driver.switchTo().frame("frame1");
		driver.findElement(By.id("t1")).sendKeys("dfigjsffjf");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("t2")).sendKeys("fdsifsadfjg");
		
	     Thread.sleep(3000);
			driver.quit();
			
		
		
	}
	
}

	