package com.actitime.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.actitime.framework.BaseClass;

public class DeleteCustomer extends BaseClass{
	@Test
	public void deleteCustmoreTest() throws Throwable {
		  //searchTasks
		 
				driver.findElement(By.xpath("//a[@class='content tasks']/img[@class='sizer']")).click();
				Thread.sleep(3000);
				driver.findElement(By.name("searchTasks")).click();
				driver.findElement(By.xpath("//table/tbody/tr[3]/td[7]/input")).click();
				//driver.findElement(By.xpath("//table/tbody/tr[4]/td[7]/input")).click();
			/*	driver.findElement(By.xpath("//table/tbody/tr[5]/td[7]/input")).click();
				driver.findElement(By.xpath("//table/tbody/tr[6]/td[7]/input")).click();
				driver.findElement(By.xpath("//table/tbody/tr[7]/td[7]/input")).click();*/
				driver.findElement(By.xpath("//input[@value='Delete Selected Tasks']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@value='Delete Tasks']")).click();
				Thread.sleep(8000);
				driver.close();
		  
		  
	  }
}
