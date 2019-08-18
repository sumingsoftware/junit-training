package com.hsbc.test;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTestFixture {
	@Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(100, 50);
        assertEquals(150, result, 0);
        System.out.println("execute test");
    }
	
	
    @Before
    public void setUp() throws Exception {
        System.out.println("Before Start...");
    }
    
    @After
    public void tearDown() throws Exception {
        System.out.println("After Starting...");
    }
}
