package org.sec;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	@DataProvider(name="value")
	public static Object[][] getdata() {
		return new Object[][] {{"hi javaa","welcome"},{"welcome","hijavv"}};

	}  
	
}
