package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.demo.MainClass;

class DivisionPositiveTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
	   double a = MainClass.div(10, 5);
	   assertEquals(2, a);
	}
	
	@Test
	void test1() {
		//fail("Not yet implemented");
	   double a = MainClass.div(10, 0);
	   assertEquals(0.0, a);
	}
	
	@Test
	void test2() {
		//fail("Not yet implemented");
	   double a = MainClass.div(10, -5);
	   assertEquals(0, a);
	}
	
	

}
