package com.hsbc.mockito.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.hsbc.test.Calculator;

public class CalculatorTestUsetMockito {
	@Test
	public void sum() {
		// assertSame(4, new Calculator().sum(2, 2));
		Calculator c = mock(Calculator.class);
		when(c.sum(2, 2)).thenReturn((long) 4);

		assertEquals(4, c.sum(2, 2));

	}

	@Test
	public void handleException() {
		OutputStream osMock = mock(OutputStream.class);
		OutputStreamWriter osw = new OutputStreamWriter(osMock);
		try {
			/*
			 * 因为close()方法的返回值是void，所以只能用这只格式
			 * 如果返回值不是void，也可以使用when(someMethod()).thenThrow(new Exception());
			 */
			doThrow(IOException.class).when(osMock).close();
			osw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void iscalled() {
		List<String> mockedList = mock(List.class);
		mockedList.add("one");
		mockedList.add("two");
		verify(mockedList).add("one");
	}
	
	@Mock
	private static CalculatorInterface calculatorInterface;

	@Before
	public void setUp1(){
		calculatorInterface = mock(CalculatorInterface.class);
		when(calculatorInterface.add(2, 2)).thenReturn((double) 4);
	}
	
	@Test
	public void testCalculatorInterface() {
		assertEquals(4, calculatorInterface.add(2, 2), 0);
	}
	
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		double result = calculator.add(2, 2);
		assertEquals(4, result, 0);
	}
}
