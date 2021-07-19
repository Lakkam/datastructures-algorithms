package com.lakkam.ds;

public class RecursionExample {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("method 1 : " + recursiveMethod1(n));
		System.out.println("method 2 : " + recursiveMethod2(n));

		// System.out.println("method 1 with static value: " +
		// recursiveStaticMethod1(x));
		System.out.println("method 2 with static value: " + recursiveStaticMethod2(n));

	}

	static int x = 0;

	private static int recursiveStaticMethod2(int n) {

		if (n > 0) {
			x++;
			return recursiveStaticMethod2(n - 1) + x;//This also executed in backward direction only, but since x is a static variable, everytime, when it adds, it will add the incremented x value.
		}
		return 0;
	}

	/*
	 * private static int recursiveStaticMethod1(int x2) { if (x2 > 0) { ++x2;
	 * return recursiveStaticMethod1(x2 - 1) + x2; } return 0; }
	 */

	private static int recursiveMethod2(int n) {

		if (n > 0) {
			return n + recursiveMethod2(n - 1); // In this case also first recursive method gets executed and it will
												// add the value n at the backward calling..
		}
		return 0;

	}

	private static int recursiveMethod1(int n) {

		if (n > 0) {
			return recursiveMethod1(n - 1) + n; // This will add the n to this function in descending order or when
												// going
												// back the control...Thats why finally this method will give us 15 as
												// result
		}
		return 0;

	}

}
