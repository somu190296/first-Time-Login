package org.demoblaze;

import org.baseclass.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseFlight extends LibGlobal {
	public PurchaseFlight() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="inputName")
	private WebElement txtname;
	
	@FindBy(id="address")
	private WebElement txtaddres;
	
	@FindBy(id="city")
	private WebElement txtcity;
	
	@FindBy(id="state")
	private WebElement txtstate;
	
	@FindBy(id="zipCode")
	private WebElement txtzipCode;
	
	@FindBy(id="cardType")
	private WebElement txtcardType;
	
	@FindBy(id="creditCardNumber")
	private WebElement txtcreditCardNumber;
	
	@FindBy(id="creditCardMonth")
	private WebElement txtcreditCardMonth;
	
	
	@FindBy(id="creditCardYear")
	private WebElement txtcreditCardYear;
	
	@FindBy(id="nameOnCard")
	private WebElement txtnameOnCard;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnpurchase;

	
	public WebElement getTxtname() {
		return txtname;
	}

	public WebElement getTxtaddres() {
		return txtaddres;
	}

	public WebElement getTxtcity() {
		return txtcity;
	}

	public WebElement getTxtstate() {
		return txtstate;
	}

	public WebElement getTxtzipCode() {
		return txtzipCode;
	}

	public WebElement getTxtcardType() {
		return txtcardType;
	}

	public WebElement getTxtcreditCardNumber() {
		return txtcreditCardNumber;
	}

	public WebElement getTxtcreditCardMonth() {
		return txtcreditCardMonth;
	}

	public WebElement getTxtcreditCardYear() {
		return txtcreditCardYear;
	}

	public WebElement getTxtnameOnCard() {
		return txtnameOnCard;
	}
	public WebElement getBtnpurchase() {
		return btnpurchase;
	}


	
	
	
	

}
