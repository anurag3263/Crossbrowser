package com.CrossBrowser.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage {

	@FindBy(id = "username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTextfield;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepmeloginCheckoox;
	
	@FindBy(id = "loginButton")
	private WebElement Loginbutton;
	
	@FindBy(id = "logoutLink")
	private WebElement logoutButton;
	
	public  ActiTimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void loginMethod() throws IOException
	{
	usernameTextfield.sendKeys("admin");	
	passwordTextfield.sendKeys("manager");
	keepmeloginCheckoox.click();
	Loginbutton.click();
	}
	
}
