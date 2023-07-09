package com.spicejet.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.spicejet.qa.base.PageBase;
import com.spicejet.qa.page.LoginPage;


public class LoginPageTest extends PageBase{

	public LoginPageTest() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setUpTest() {
	String browser=	prop.getProperty("browsername");
	String url=	prop.getProperty("url");
		
		setUp(browser, url);
		
	}
	@Test
	public void login() throws IOException {
		LoginPage lgn=new LoginPage();
		
		String userid=	prop.getProperty("userid");
		String pwd=	prop.getProperty("password");
		lgn.login(userid, pwd);
		
		
	}
	
	
	
	@AfterMethod
	public void tearDownTest() {
		
	}

}
