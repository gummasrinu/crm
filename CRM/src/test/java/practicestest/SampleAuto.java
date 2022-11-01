package practicestest;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver.Timeouts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.compress.utils.Lists;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.soap.Text;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleAuto {

	

	public static void main(String[] args) throws NoSuchSessionException, EncryptedDocumentException, IOException {
		FileInputStream fs =new FileInputStream("./src/test/resources/srinusheet.xlsx");
		Workbook wb= WorkbookFactory.create(fs);
        Sheet sh= wb.getSheet("testdata");
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	java.util.List<WebElement>links=driver.findElements(By.xpath("//a"));
		int count=links.size();
		for(int i=0;i<count;i++){
			Row r=sh.createRow(i);
			Cell c=r.createCell(0);
			c.setCellValue(links.get(i).getAttribute("href"));
		FileOutputStream fo=new FileOutputStream("./src/test/resources/srinusheet.xlsx");
		wb.write(fo);
		driver.quit();
			}
		
		
		//Date d=new Date();
		//String value =d.toString();
		//String rep=value.replace(":", "-");
		//System.out.println(rep);
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("./ScreenShot/Sample1.jpeg");
		//File dst=new File(photo+replace+".jpeg");
		Files.copy(src, dst);*/
	
		
		/*WebDriver driver=WebDriverManager.chromiumdriver().create();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gummaSrinu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		Thread.sleep(3000);
		alt.dismiss();*/
		
		
		//WebElement element2=driver.findElement(By.xpath("//div[@id='box107']"));
   /* Actions act  =new Actions(driver) ;
		act.(element).perform();
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_T);
		Thread.sleep(3000);*/
		//driver.quit();
    

		
		
		
		
	}
			
			
			
		
		 

	}
	

	