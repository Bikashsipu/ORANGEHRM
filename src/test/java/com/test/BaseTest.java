package com.test;

import org.testng.annotations.BeforeTest;

import com.orange.generic.DriverUtils;



public class BaseTest {
	
	@BeforeTest
	
		public void setUp( )
		{
			DriverUtils.createDriver();
		}


}
