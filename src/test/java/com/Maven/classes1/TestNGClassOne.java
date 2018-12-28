package com.Maven.classes1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClassOne {

	@BeforeMethod
	public void BeforMethod() {
		System.out.println("*****Befor execution******");

	}

	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("*****After Execution*********");
	}

	@Test
	public void testMethod() {
		System.out.println("This code is from test method");

	}

	@Test
	public void testMethodTwo() {
		System.out.println("This code is test method2");
	}

}
