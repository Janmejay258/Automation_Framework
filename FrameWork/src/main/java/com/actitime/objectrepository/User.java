package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User {
	
	private @FindBy(xpath="//input[@value='Create New User']")
	WebElement newUser;
	private @FindBy(name="username")
	WebElement usernameTxt;
	private @FindBy(name="passwordText")
	WebElement passwordText;
	private @FindBy(name="firstName")
	WebElement firstnameTxt;
	private @FindBy(name="phone")
	WebElement phoneTxt;
	private @FindBy(name="lastName")
	WebElement lastnameTxt;
	private @FindBy(name="fax")
	WebElement faxTxt;
	private @FindBy(name="middleName")
	WebElement middleNaTxt;
	private @FindBy(name="mobile")
	WebElement mobileTxt;
	private @FindBy(name="email")
	WebElement emailTxt;
	private @FindBy(name="otherContact")
	WebElement otherTxt;
	private @FindBy(xpath="//table/tbody/tr[4]/td[@class='formbuttonpane']/input[1]")
	WebElement creatUser;
	public void userCreation(String uname,String pass,String fname,String phn,String lstn,
			String fax,String mn,String mob,String email,String oT) {
		newUser.click();
		usernameTxt.sendKeys(uname);
		passwordText.sendKeys(pass);
		firstnameTxt.sendKeys(fname);
		phoneTxt.sendKeys(phn);
		lastnameTxt.sendKeys(lstn);
		faxTxt.sendKeys(fax);
		middleNaTxt.sendKeys(mn);
		emailTxt.sendKeys(email);
		otherTxt.sendKeys(oT);
		mobileTxt.sendKeys(mob);
		creatUser.click();
		
	}
	
	

}
