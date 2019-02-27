package com.actitime.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.framework.BaseClass;
import com.actitime.objectrepository.CreatTask;
import com.actitime.objectrepository.Home;


@Listeners(com.actitime.framework.LisetenerTest.class)
public class CreatCustomerTest extends BaseClass{
	@Test(enabled=true)
	public void creatCustomerTest() throws Throwable {
		Home h=PageFactory.initElements(driver, Home.class);
		h.clickTaskImg();
		 String custmorName=lib.getExcelData("Sheet1",0, 6);
		 String projectName=lib.getExcelData("Sheet1", 1, 3);
		 String massg=lib.getExcelData("Sheet1", 1, 2);
		
		CreatTask tsk=PageFactory.initElements(driver, CreatTask.class);
		tsk.taskWork(custmorName, projectName, massg);
		String expSubText = "1 new task was added to the customer";
		String actualText = driver.findElement(By.xpath("//table/tbody/tr[3]/td[@class='pagetitle']")).getText();
		if (actualText.contains(expSubText)) {
			System.out.println("Custmor Is Created == Pass");
		} else {
			System.out.println("Custmor Is not Created == Fail");
		}
	}
	
}
