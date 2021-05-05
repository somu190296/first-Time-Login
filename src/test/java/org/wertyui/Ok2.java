package org.wertyui;

import org.testng.annotations.Test;

public class Ok2 {
	@Test
	private void tc0() {
		System.out.println("12a");
System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc1() {
	
		System.out.println("34a");
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups="reg")
	private void tc2() {
		System.out.println("56a");
		System.out.println(Thread.currentThread().getId());
	}
	

}
