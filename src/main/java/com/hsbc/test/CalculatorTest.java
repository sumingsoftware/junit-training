package com.hsbc.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		double result = calculator.add(100, 50);
		assertEquals(150, result, 0);
	}

	@Test
	public void testIsLargeThan() {
		Calculator calculator = new Calculator();
		boolean result = calculator.isLargeThan(100, 50);
		assertTrue(result);
	}

	@Test
	public void testIsNotLargeThan() {
		Calculator calculator = new Calculator();
		boolean result = calculator.isLargeThan(100, 50);
		assertFalse(result);
	}

	@Test
	public void testIsNull() {
		Calculator calculator = new Calculator();
		boolean result = calculator.isLargeThan(100, 50);
		assertNull(result);
	}

	@Test
	public void testIsNotNull() {
		Calculator calculator = new Calculator();
		boolean result = calculator.isLargeThan(100, 50);
		assertNotNull(result);
	}

	@Test
	// @Ignore
	@Ignore("I don¡¯t want Dave to know this doesn¡¯t work")
	public void testIgnore() {
		Calculator calculator = new Calculator();
		boolean result = calculator.isLargeThan(100, 50);
		assertNotNull(result);
		System.out.println("testIgnore");
	}

	// @Before
	// public void setUp() throws Exception {
	// System.out.println("Before Start...");
	// }
	//
	// @After
	// public void tearDown() throws Exception {
	// System.out.println("After Starting...");
	// }

	@BeforeClass
	public static void setUp1() throws Exception {
		System.out.println("Before class Start...");
	}

	@AfterClass
	public static void tearDown1() throws Exception {
		System.out.println("After class Starting...");
	}

	@Test
	public void testAdd2() {
		Integer.parseInt("abc");
		fail("Should fail here.");
//		try {
//			Integer.parseInt("abc");
//			//fail("Should fail here.");
//		} catch (NumberFormatException e) {
//			System.out.println("Should fail here1111.");
//		}
	}

	@Test(expected = NumberFormatException.class)
	public void testAdd1() {
		Integer.parseInt("abc");
	}

	@Test(timeout = 3000)
	public void greatBig() {
		Calculator calculator = new Calculator();
		assertTrue(calculator.ackerman(5, 5));
	}

	@Test
	public void sum() {
		assertSame(4, new Calculator().sum(2, 2));
	}

}
