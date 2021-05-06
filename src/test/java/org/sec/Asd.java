package org.sec;


import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.collections.Objects;

import com.google.common.collect.ObjectArrays;

public class Asd {
		  
	

//	@Test(dataProvider="value",dataProviderClass=Dataprovider.class)
//	
//	
//	
//	public void tco(String s,String s1) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\org.sec\\driver\\chromedriver.exe");
//		 WebDriver driver = new ChromeDriver();
//	   driver.get("https://www.facebook.com/");
//
//		WebElement txtuser = driver.findElement(By.id("email"));
//		txtuser.sendKeys(s);
//		WebElement txtpass = driver.findElement(By.id("pass"));
//	txtpass.sendKeys(s1);
//	
//	}
//	
//	
//	@DataProvider(name="value")
//	private Object[][] getdata() {
//		return new Object[][] {{"hi javaa","welcome"},{"welcome","hijavv"}};
//
//	}  
//	
//	
//}
	public static void main(String[] args) {
		System.out.println("sdfghjk");
		System.out.println("sdfghjk");
		System.out.println("sdfghjk");
	}}

	
	
}
public void tco(String s,String s1) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\org.sec\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
   driver.get("https://www.facebook.com/");

	WebElement txtuser = driver.findElement(By.id("email"));
	txtuser.sendKeys(s);
	WebElement txtpass = driver.findElement(By.id("pass"));
txtpass.sendKeys(s1);

}


//@DataProvider(name="value")
//private Object[][] getdata() {
//	return new Object[][] {{"hi javaa","welcome"},{"welcome","hijavv"}};
//
//}  


}
