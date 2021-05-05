package org.demoblaze;

import org.baseclass.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseFlight extends LibGlobal {
	
	public ChooseFlight() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='submit'][1]")
	private WebElement btnchooseflight;

	public WebElement getBtnchooseflight() {
		return btnchooseflight;
	}

}
