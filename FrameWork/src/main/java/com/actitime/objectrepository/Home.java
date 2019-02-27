package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	private @FindBy(xpath="//div[text()='TASKS']")
    WebElement taskImg;
	private @FindBy(xpath="//a[@class='content users']/img")
	WebElement userclick;

	public void clickTaskImg(){
		taskImg.click();
		
	}
	public void clickUserImg() {
		userclick.click();
	}
}
