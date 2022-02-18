package com.loginpage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TC1 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("will run before all the test methods belonging to current class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("will run after all the test methods belonging to current class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this will execute before the every test method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("this will execute after the every test method");
	}

	@Test
	public void test1() {
		System.out.println("this is test1...");
	}

	@Test
	public void test2() {
		System.out.println("this is test2...");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("will execute before all the class methods belonging to a folder");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("will execute after all the class methods belonging to a folder");
	}

}
