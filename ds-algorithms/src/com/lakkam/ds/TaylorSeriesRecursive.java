package com.lakkam.ds;

public class TaylorSeriesRecursive {

	public static void main(String[] args) {
		System.out.println(taylorSeries(1, 10));

	}

	// Taylor Series formula is e^x=1+(x/1)+(x^2/2!)+(x^3/3!)+.....n times
	// Basically, this problem has sum, power and factorial recursive requirements
	// and we need to combine everything...
	// So, to solve more than 2 problem statements or 2 functions in recursive way,
	// we will go with static variables

	private static int p=1;// for power operation
	private static int f=1;// for factorial operation
	private static double r;// for result.

	 static double taylorSeries(int x, int n) {

		if (n == 0) {
			return 1;// becasue e^0 is 1 and 0! is also 1.
		}
		// first function iself needs to return addition recursively and give a result.

		r= taylorSeries(x, n - 1);
		p = p * x;
		f = f * n;
 		return r + p / f;

	}

}
