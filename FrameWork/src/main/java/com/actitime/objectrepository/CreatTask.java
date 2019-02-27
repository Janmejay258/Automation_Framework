package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class CreatTask {
//	public com.actitime.framework.Filelib lib=new com.actitime.framework.Filelib();
private	@FindBy(id="ext-gen40")
	  WebElement creatNewTask;
private @FindBy(id="ext-comp-1019")
WebElement buttonclick;
private  @FindBy(xpath="//a[text()='- New Customer -']")
	  WebElement newCustomer;
private @FindBy(id="createTasksPopup_newCustomer")
      WebElement cosName;
private @FindBy(id="createTasksPopup_newProject")
      WebElement projectName;
private @FindBy(xpath="//table[@class='createTasksTable hideEstimate']/tbody/tr[1]/td[@class='nameCell first']/input")
      WebElement tskname;
private @FindBy(id="createTasksPopup_commitBtn")
      WebElement creatTask;
public void taskWork(String customername,String projectname,String taskName) throws Throwable {
	

	creatNewTask.click();
	Thread.sleep(3000);
	buttonclick.click();
	Thread.sleep(3000);
	newCustomer.click();
	
	cosName.sendKeys(customername);
	
	projectName.sendKeys(projectname);

	tskname.sendKeys(taskName);
	creatTask.click();
	}
}
