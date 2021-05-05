package org.wertyui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ok {
	
	@Test
	private void tc0() {
		System.out.println("12b");
System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc1() {
	
		System.out.println("34b");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc2() {
		System.out.println("56b");
		System.out.println(Thread.currentThread().getId());
	}
	
	
	
	
	
	
	
	}


