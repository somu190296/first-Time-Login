package org.demoblaze;

import org.baseclass.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBlazeHome extends LibGlobal{
	
	public DemoBlazeHome() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(name="fromPort")
   private WebElement txtdepatture;
	
	@FindBy(name="toPort")
	private WebElement txtdestination;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnsubmit;

	
	public WebElement getTxtdepatture() {
		return txtdepatture;
	}

	public WebElement getTxtdestination() {
		return txtdestination;
	}
	public WebElement getBtnsubmit() {
		return btnsubmit;
	}


	

	}
	
	
		

	
	


