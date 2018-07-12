package com.verticalapps.demo.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.verticalapps.demo.PlainOldJavaObject;

public class POJOTest {
	public static PlainOldJavaObject pojo;
	public static String thing1 = "First String";
	public static String thing2 = "Second String";

	@Before
	public void before() {
		pojo = new PlainOldJavaObject(thing1, thing2);
	}
	
	@Test
	public void testConstructor() {
		assertEquals(thing1, pojo.getThing1());
		assertEquals(thing2, pojo.getThing2());
	}
	
	@Test
	public void testSetThing1() {
		String newDrank = "Tester String";
		pojo.setThing1(newDrank);
		assertEquals(newDrank, pojo.getThing1());
	}
	
	@Test
	public void testSetThing2() {
		String new2 = "Test 2 String";
		pojo.setThing2(new2);
		assertEquals(new2, pojo.getThing2());
	}
	
	@Test
	public void testEquals() {
		PlainOldJavaObject pojo2 = new PlainOldJavaObject(thing1, thing2);
		assertEquals(pojo, pojo2);
	}

}
