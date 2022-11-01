package practicestest;

import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();;
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement element =driver.findElement(By.xpath("//a[.='Twitter']"));
		org.openqa.selenium.Point loc=element.getLocation();
		int x=loc.getX();
		System.out.println(x);
		int y=loc.getY();
		System.out.println(y);
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		element.click();
		/*driver.findElement(By.xpath("//div[@class='a-section octopus-dlp-image-shield']"));
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screenshot/amazon4.jpeg");
		Files.copy(src,dst);
		Thread.sleep(3000);*/
		driver.quit();





























		/*driver.get("file:///C:/Users/venkat/Desktop/dropdown.html");
	WebElement element=driver.findElement(By.id("hotel taj"));
Select sel=new Select(element);
List<WebElement> menulist=sel.getOptions();
for(WebElement values:menulist) {
	System.out.println(values.getText());
	Thread.sleep(3000);
}
System.out.println(" ");
sel.selectByIndex(0);
Thread.sleep(2000);
sel.selectByIndex(1);
Thread.sleep(2000);
sel.selectByIndex(2);
Thread.sleep(2000);
sel.selectByIndex(3);
Thread.sleep(2000);
sel.selectByIndex(4);
Thread.sleep(2000);
 String first=sel.getFirstSelectedOption().getText();
 System.out.println(first);
Thread.sleep(3000);*/




	}

}
