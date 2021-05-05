package org.reportclass;

import java.io.File;
import java.io.IOException;

import org.baseclass.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Adactinreportclss extends LibGlobal {
	LibGlobal global;
	ExtentReports report;
	ExtentHtmlReporter htm;
	ExtentTest createTest;
	TakesScreenshot tk;
	
	@BeforeSuite
	private void beforesuit() {
		 report = new ExtentReports();
		 htm = new ExtentHtmlReporter("adactin.html");
		report.attachReporter(htm);
		 
		
		

	}
	@BeforeClass
	private void beforeCass() {
		global= new LibGlobal();
		global.getDriver();
		global.launchUrl("https://adactinhotelapp.com/");	
		}
	@Test
	private void tc0() throws IOException {
	    createTest = report.createTest("adactin homepge is crt or wrong");
	    createTest.log(Status.INFO, "adactin url crt or wrong");
	    tk = (TakesScreenshot) driver;
	    File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(screenshotAs,new File("adactin.png"));
	    if (driver.getCurrentUrl().contains("adactinhotelapp")) {
	    	createTest.log(Status.PASS, "adactin url is crt");
	    	createTest.addScreenCaptureFromPath("adactin.png");
			
		}else {
			createTest.log(Status.FAIL, " adactin url is not crt");
		}
	    createTest.log(Status.INFO, "text is presend or not");
	    WebElement findElement = driver.findElement(By.xpath("//p[contains(text(),'Adactin ')]"));
	    
	    
	    
	    if (findElement.getText().contains("Adactin ")) {
	    	createTest.log(Status.PASS, "text is presend");
			
		}else {
			createTest.log(Status.FAIL, "texi not presend");
		}
	   }
	@Test
	private void tc1() throws IOException {
		ExtentTest createTest1 = report.createTest("check username and pass");
        
		WebElement element = driver.findElement(By.id("username"));
		global.enterText(element, "ertyui");
		WebElement element1 = driver.findElement(By.id("password"));
		global.enterText(element1, "asdfghj");
		
		tk = (TakesScreenshot) driver;
	    File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(screenshotAs,new File("u&p.png"));
	    createTest1.addScreenCaptureFromPath("u&p.png");
	
		WebElement element2 = driver.findElement(By.id("login"));
		global.btnClick(element2);
		
		 
	}
	@AfterClass
	private void afClas() {
		driver.close();

	}
	@AfterSuite
	private void afterSuit() {
		report.flush();

	}
	
	

}
