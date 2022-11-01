package practicestest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class MouseOver {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream fs=new FileInputStream("./src/test/resources/exceldata.xlsx");
	Workbook wb= WorkbookFactory.create(fs);
	
	Sheet sh=wb.getSheet("sheet1");
	Row r=sh.getRow(0);
	Cell c=r.getCell(1);
	String str=c.getStringCellValue();
	System.out.println(str);
	Row r1=sh.getRow(1);
	Cell c1=r.getCell(0);
	String str1=c.getStringCellValue();
	System.out.println(str1);
	Thread.sleep(2000);
	WebDriver driver=WebDriverManager.chromedriver().create();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(str);
	driver.findElement(By.xpath("//input[@type='password']"));sendkeys(str1);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(3000);
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	Sheet sh=wb.getSheet("sheet1");
	Row r=sh.getRow(1);
	Cell c=r.getCell(1);
	String value=c.getStringCellValue();
	System.out.println(value);
	*/

	}

	private static void sendkeys(String str1) {
		// TODO Auto-generated method stub
		
	}

	
		
	


		
	}


