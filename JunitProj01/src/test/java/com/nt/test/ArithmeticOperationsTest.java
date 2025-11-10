package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;



import com.nt.service.ArithmeticOperations;

@DisplayName("ArithmeticOperationsTest")
//@TestMethodOrder(OrderAnnotation.class)
//@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.DisplayName.class)
//@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.MethodName.class)
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.Random.class)

public class ArithmeticOperationsTest {
	private  static ArithmeticOperations ops;
	
	@BeforeAll
	public  static void  setupOnce() {
		System.out.println("ArithmeticOperationsTest.setupOnce()");
		ops=new ArithmeticOperations();
	}
	
	
	@BeforeEach
	public    void  setup() {
		System.out.println("ArithmeticOperationsTest.setup()");
	}
	
	
	
	@Test
	@DisplayName("test1Sum wit +ves")
	@Order(10)
	public void  testSumWithPositives() {
		System.out.println("ArithmeticOperationsTest.testSumWithPositives()");
	    double  a=100.0;
	    double  b=200.0;
	    double expected=300.0;
	    double actual=ops.sum(a, b);
	    assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("test2Sum with -ves")
	@Order(1)
	public void  testSumWithNegetives() {
		System.out.println("ArithmeticOperationsTest.testSumWithNegetives()");
	    double  a=-100.0;
	    double  b=-200.0;
	    double expected=-300.0;
	    double actual=ops.sum(a, b);
	    assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("test3Sum with mixed values")
	@Order(15)
	public void  testSumWithMixedValues() {
		System.out.println("ArithmeticOperationsTest.testSumWithMixedValues()");
	    double  a=-100.0;
	    double  b=200.0;
	    double expected=100.0;
	    double actual=ops.sum(a, b);
	    assertEquals(expected,actual);
	}
	
	@Test
	@Order(-13)
	@DisplayName("test4Sum with zeros")
	public void  testSumWithZeroValues() {
    System.out.println("ArithmeticOperationsTest.testSumWithZeroValues()");
        double  a=0.0;
	    double  b=0.0;
	    double expected=0.0;
	    double actual=ops.sum(a, b);
	    assertEquals(expected,actual);
	}
	
	@Test
	@Order(100)
	//@Disabled
	@DisplayName("test5Sum with high Values")
	public void  testSumWithHighValues() {
		System.out.println("ArithmeticOperationsTest.testSumWithHighValues()");
	    double  a=1111111111111.0;
	    double  b=2222222222222.0;
	    double expected=3333333333333.0;
	    double actual=ops.sum(a, b);
	    assertEquals(expected,actual,0.5,"testing with high values is failed");
	}
	
	@Test
	@DisplayName("test6Sum with Timeout")
	@Order(0)
	public  void  testSumForTimeout() {
		System.out.println("ArithmeticOperationsTest.testSumForTimeout()");
		assertTimeout(Duration.ofMillis(3020),()->ops.sum(1000.0, 2000.0) );
	}
	
	
	@AfterEach
	public    void tearDown() {
		System.out.println("ArithmeticOperationsTest.tearDown()");
	}
	
	
	@AfterAll
	public  static void  tearDownOnce() {
		System.out.println("ArithmeticOperationsTest.tearDownOnce()");
		ops=null;
	}
	

}
