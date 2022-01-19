package com.junit.demo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		div(10, 5);

		System.out.println(div(10, 5));
	}

	public static double div(double a, double b) {
		double c;
		if (b <= 0) {
			return 0.0;
		}

		else {

			c = a / b;
		}

		return c;

	}

}
