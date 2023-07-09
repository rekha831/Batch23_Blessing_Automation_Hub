package com.spicejet.qa.page;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spicejet.qa.base.PageBase;

public class LoginPage extends PageBase{

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	//Objet Reository /Page Factory
	
	@FindBy(xpath = "//div[text()='Login']")
	WebElement loginIckon;
	
	@FindBy(xpath = "//input[@data-testid='user-mobileno-input-box']")
	WebElement userIdfld;
	
	@FindBy(xpath = "//input[@data-testid='password-input-box-cta']")
	WebElement password;
	
	@FindBy(xpath = "//div[@data-testid='login-cta']")
	WebElement loginBtn;
	
	
	public void login(String userId, String pwd) {
		loginIckon.click();
		
		userIdfld.sendKeys(userId);
		
		password.sendKeys(pwd);
		
		loginBtn.click();
		
	}
	public void logOut() {
		
	}

}
