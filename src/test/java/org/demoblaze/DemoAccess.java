package org.demoblaze;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoAccess extends LibGlobal {
	 LibGlobal global;
	
	@BeforeClass
	private void beforeclass() {
		 global = new LibGlobal();
		 global.getDriver();
		 global.launchUrl("https://blazedemo.com/");
	}
	@Parameters({"one","two"})
		
	@Test
	private void tc0(String s,String s1) {
		DemoBlazeHome home =new DemoBlazeHome();
	     global.enterText(home.getTxtdepatture(), s);	
	     global.enterText(home.getTxtdestination(), s1);
	     global.btnClick(home.getBtnsubmit());
	}
	@Test
	private void tc1() {
		ChooseFlight choose = new ChooseFlight();
		global.btnClick(choose.getBtnchooseflight());

	}
	@Parameters({"name","addres","city","state","zipCode","cardType",
		"creditCardNumber","creditCardMonth","creditCardYear","nameOnCard"})
	@Test
	private void tc2(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9) throws IOException {
		PurchaseFlight fill = new PurchaseFlight();
		
		global.enterText(fill.getTxtname(), s);
		global.enterText(fill.getTxtaddres(), s1);
		global.enterText(fill.getTxtcity(), s2);
		global.enterText(fill.getTxtstate(), s3);
		global.enterText(fill.getTxtzipCode(), s4);
		global.enterText(fill.getTxtcardType(), s5);
		global.enterText(fill.getTxtcreditCardNumber(), s6);
		global.enterText(fill.getTxtcreditCardMonth(), s7);
		global.enterText(fill.getTxtcreditCardYear(), s8);
		global.enterText(fill.getTxtnameOnCard(), s9);
		
		global.btnClick(fill.getBtnpurchase());
		
		WebElement findElement = driver.findElement(By.xpath("//td[normalize-space()='Id']//following::td[1]"));
         
         
		String text = findElement.getText();
         
         File f  = new File("C:\\Users\\ADMIN\\eclipse-workspace\\org.sec\\excel\\fightbook.xlsx");
         FileInputStream i= new FileInputStream(f);
         Workbook w = new XSSFWorkbook(i);
         Sheet sh = w.getSheet("Sheet1");
         
         Row r = sh.createRow(0);
         Cell c = r.createCell(0);
         c.setCellValue(text);
	 
         FileOutputStream o=new FileOutputStream(f);
         w.write(o);
         
         System.out.println("order no is "+text);
         System.out.println("finish");
         
         
	     	

}
}