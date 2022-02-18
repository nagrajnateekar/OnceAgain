package com.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//based on result of test cases we perform certain actions it is known as listeners and these are listeners methods
//these methods will automatically triggered based on the situations
//@Listeners(com.listeners.CustomListners.class) //class level listener and which in testng.xml
//file that is suite level listener
public class IlistenersDemo  {
	
	@Test
	public void test1() {
		System.out.println("this is test1");
		Assert.assertEquals("a", "a");
	}
	@Test
	public void test2() {
		System.out.println("this is test2");
		Assert.assertEquals("a", "a");
	}
	@Test
	public void test3() {
		System.out.println("this is test3");
		throw new SkipException("this is skip exception");
	}

}
