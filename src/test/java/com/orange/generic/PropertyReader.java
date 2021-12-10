package com.orange.generic;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {
	static Properties p=new Properties();
	public static void initProperty()
	{
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\BKUMARJE\\Desktop\\Eclipse Selenium Program\\DemoWebshop\\src\\test\\resources\\config\\demoWebshop.properties");
			
			p.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static String getProperty(String key)
	{
		return p.getProperty(key);
		
	}
		
	}

