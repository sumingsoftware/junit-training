package com.hsbc.test;

public class Calculator {
	public double add(double a, double b) {
		return a + b;
	}

	public boolean isLargeThan(double a, double b) {
		return a > b ? true : false;
	}

	public boolean ackerman(double a, double b) {
		boolean result = false;

		try {
			Thread.sleep(2000);

			if (a == b) {
				result = true;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return result;
	}

	public long sum(long x, long y) {
		return x + y;
	}

}
