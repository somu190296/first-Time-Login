package org.reportclass;


import java.io.File;
import java.io.IOException;

import org.baseclass.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestingReortClass extends LibGlobal {
	LibGlobal global;
	ExtentReports reports;
	ExtentHtmlReporter htmlreporter;
	ExtentTest createTest;
	TakesScreenshot tk;
	@BeforeSuite
	private void beforeSuie() {
		 global = new LibGlobal();
		 reports = new ExtentReports();
	  htmlreporter = new ExtentHtmlReporter("facebook.html");
		reports.attachReporter(htmlreporter);
		

	}
	@BeforeClass
	private void beforeClass() {
		global.getDriver();
		global.launchUrl("https://www.facebook.com/");
		
		}
	@Test
	private void tc0() throws IOException {
		createTest = reports.createTest("validating fb home page");
		 createTest.log(Status.INFO, "validating fb url");
		 tk=(TakesScreenshot) driver;
		 File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(screenshotAs, new File("fb.png"));
		if (driver.getCurrentUrl().contains("facebook")) {
		createTest.log(Status.PASS, "valid url");	
		createTest.addScreenCaptureFromPath("fb.png");
			
		}else {
			createTest.log(Status.FAIL, "invalid url");
		}
		createTest.log(Status.INFO, "validating facebok ext present or not");
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'people')]"));
		if (text.getText().contains("people in")) {
			
		createTest.log(Status.PASS, "text presend in page")	;
		}else {
			createTest.log(Status.FAIL, "text not present in page");
			
		}}
			@Test
			private void tc1() throws IOException {
			ExtentTest createTest1 = reports.createTest("validating user name and password");
			
			WebElement txtuser = driver.findElement(By.id("email"));
			global.enterText(txtuser, "hijava");
			
			WebElement txtpass = driver.findElement(By.id("pass"));
			global.enterText(txtpass, "java");
			
			 tk=(TakesScreenshot) driver;
			 File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
			 FileHandler.copy(screenshotAs, new File("cfredential.png"));
			 createTest1.addScreenCaptureFromPath("cfredential.png");
			
			
			WebElement btnclick = driver.findElement(By.name("login"));
			global.btnClick(btnclick);
			}
			@Test
			private void tc2() {
				ExtentTest createTest2 = reports.createTest("text is present or not");
				createTest2.log(Status.INFO, "");

			}
			
			
			
			}
			
			
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		

	
	


