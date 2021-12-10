package com.test;

import org.testng.annotations.Test;

import com.basepage.AdminPage;
import com.basepage.LoginPage;
import com.orange.generic.PropertyReader;


public class LoginTest extends BaseTest {
	LoginPage l=new LoginPage();
	AdminPage a1=new AdminPage();
	@Test
public void VerifyLogin() throws InterruptedException
	{
		
		//l.OpenWebsite();
		PropertyReader.initProperty();
		l.OpenWebsite(PropertyReader.getProperty("OpenWebsite"));
		Thread.sleep(3000);
		//l.enterUsername("Admin");
		l.enterUsername(PropertyReader.getProperty("username"));
		Thread.sleep(3000);
		//l.enterPassword("admin123");
		l.enterPassword(PropertyReader.getProperty("password"));
		Thread.sleep(3000);
		l.clickLogin();
		}	
	@Test(priority=1)
	public void VerifyAddUser()
	{
		 a1.Action();
		 a1.SelectRole();
		 PropertyReader.initProperty();
		// a1.enterEname("Sipu");
		 a1.enterEname(PropertyReader.getProperty("enterEname"));
		// a1.enterUname("Mithu");
		 a1.enterUname(PropertyReader.getProperty("enterUname"));
		 a1.SelectStatus();
		// a1.enterPwd("Sipu@1234");
		 a1.enterPwd(PropertyReader.getProperty("enterPwd"));
		// a1.enterCPwd("Sipu@1234");
		 a1.enterCPwd(PropertyReader.getProperty("enterCPwd"));
		 a1.clickSave();
	}
	

	}
	


