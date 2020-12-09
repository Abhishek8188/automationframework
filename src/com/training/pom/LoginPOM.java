package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@placeholder='Enter Your Mobile Number'])[1]")
	private WebElement userName; 
	
	@FindBy(xpath="(//input[@type='password' and @class='for_my_input'])[1]")
	private WebElement password;
	
	@FindBy(id="login_main_btn")
	private WebElement loginBtn; 
	
	@FindBy(xpath="(//div[@class='form_gap']/button)[1]")
	private WebElement Login;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickLogin() {
		this.Login.click(); 
	}
}
