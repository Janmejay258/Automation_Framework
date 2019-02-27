package com.actitime.framework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectrepository.Login;
import com.actitime.objectrepository.Logout;



public class BaseClass {
	private static final Object Login = null;
	public static WebDriver driver=null;
	public Filelib lib =new Filelib();
	@BeforeClass
	public void configBC() {
		System.out.println("launch Browser");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void configBM() throws Throwable {
		String URL=lib.getPropertyKeyValue("url");
		String USERNAME=lib.getPropertyKeyValue("user");
		String PASSWORD=lib.getPropertyKeyValue("password");
		System.out.println(URL);
	driver.get(URL);
	Login log= PageFactory.initElements(driver, Login.class);
	log.loginApp(USERNAME, PASSWORD);
	}
	@AfterMethod
	public void ConfigAM() {
		Logout log= PageFactory.initElements(driver, Logout.class);
		log.logout();
	}
	@AfterClass
	public void configAC() {
		driver.close();
	}

}
