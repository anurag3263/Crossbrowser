package com.CrossBrowser.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.CrossBrowser.generics.BaseTest;
import com.CrossBrowser.pom.ActiTimeLoginPage;

public class ActitimeLogin  extends BaseTest{
	@Test
	public void login() throws IOException
	{
		ActiTimeLoginPage login=new ActiTimeLoginPage(driver);
		login.loginMethod();
	}
	
}
