package com.actitime.objectrepository;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
	@FindBy(id="logoutLink")
	WebElement logoutlink;
	public void logout() {
		while(true) {
		try {
		logoutlink.click();
		break;
		}
		catch(Throwable Ne) {
			System.out.println("Handled");
		}
	}
	}
}
