package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nt.service.StringUtil;

public class StringUtilTest {
	private static StringUtil util;
	
	@BeforeAll
	public  static void setupOnce() {
		System.out.println("StringUtilTest.setupOnce()");
		util=new StringUtil();
		
	}
	
	@BeforeEach
	public void  setup() {
		System.out.println("StringUtilTest.setup()");
		
	}
	
	@Test
	public void testIsPalledromWithValidData() {
		System.out.println("StringUtilTest.testIsPalledromWithValidData()");
		boolean flag=StringUtil.isPallendrome("madam");
		assertTrue(flag);
	}
	
	@Test
	public void testIsPalledromWithInValidData() {
		System.out.println("StringUtilTest.testIsPalledromWithValidData()");
		boolean flag=StringUtil.isPallendrome("madam1");
		assertFalse(flag);
	}
	
	@Test
	public void testIsPalledromWithNoData() {
		System.out.println("StringUtilTest.testIsPalledromWithNoData()");
		assertThrows(IllegalArgumentException.class,()-> StringUtil.isPallendrome(""));
     }
	
	@Test
	public void   testCreateDateWithValidData() {
		System.out.println("StringUtilTest.testCreateDateWithValidData()");
		LocalDate  ld=util.createDate(2000, 10, 20);
		assertNotNull(ld);
		assertEquals(LocalDate.of(2000, 10, 20), ld);
		
	}
	
	@Test
	public void   testCreateDateInValidData() {
		System.out.println("StringUtilTest.testCreateDateInValidData()");
		LocalDate  ld=util.createDate(1780, 10, 20);
		assertNull(ld);
		
		
	}
	
	@Test
	public void  testSingleTonClass() {
		Runtime rt1=Runtime.getRuntime();
		Runtime rt2=Runtime.getRuntime();
		assertSame(rt1, rt2);
		
	}
	
	@Test
	public void  testNonSingleTonClass() {
		LocalDate d1=LocalDate.now();
		LocalDate  d2=LocalDate.now();
	    assertNotSame(d1, d2);
		
	}
	
	
	
	@AfterEach
	public void  teardown() {
		System.out.println("StringUtilTest.teardown()");
		
	}
	
	@AfterAll
	public   static void  teardownOnce() {
		System.out.println("StringUtilTest.teardownOnce()");
		util=null;
	}
	
	

}
