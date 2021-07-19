package com.lakkam.ds;

/**
 * 
 * @author ranga
 *
 *         Fibanacci Series - 0,1,2,3,5,8,13 Basically every number is sum of
 *         its previous 2 numbers like n-2+n-1
 */
public class FibanacciSeries {

	static int[] a = { -1, -1, -1, -1, -1 };

	public static void main(String[] args) {

		System.out.println("fibRegular approach getting 5th term : " + fibRegular(3));
		System.out.println("fibIterativeApproach getting 5th term :" + fibIterativeApproach(3));
		System.out.println("fibRecursiveMemorization getting 3rd term... : " + fibRecursiveMemorization(3));

	}

	/**
	 * For Memorization, the approach is, when we find any element, we have to store
	 * in an array which has -1 as default values Think of how recursive tree
	 * executes this fibanacci series and finds the element.. This tree execution
	 * happens multiple times during the backward process and we need to limit the
	 * number of calls if the calls happens already and it contains any value..to
	 * check that, we need an array to store the value of that function. And when we
	 * make that call, we can check if array has the value, if so, dont call,
	 * otherwise make a recursive call... if element is <=1, then store that element
	 * in array and return the same element else element-2 is available in array,
	 * then
	 * 
	 * @param n
	 */
	private static int fibRecursiveMemorization(int n) {

		if (n <= 1) {
			a[n] = n; // So, next time, when n=0 or 1 calls happens, we can check a[0] and a[1] and
						// decide on execution...
			return n;
		}
		if (a[n - 2] == -1) { // Instead of making direct recursive call for n-2, check the array and make a
								// call..
			a[n - 2] = fibRecursiveMemorization(n - 2); // Basically making recursive call for n-2 and storing value
														// in a[n-2]
		}
		if (a[n - 1] == -1) {
			a[n - 1] = fibRecursiveMemorization(n - 1); // Making recursive call for n-1 and storing value in a[n-1]
		}
		return a[n - 2] + a[n - 1];// adding both values and returning the result will be equal to the fibanacci
									// term value...

	}

	/**
	 * This is iterative approach by using loop and getting the nth term
	 * 
	 * @param i
	 */
	private static int fibIterativeApproach(int n) {

		int t0 = 0; // For iterative approach we need initial values...t0 and t1
		int t1 = 1;
		int sum = 0; // Basically need sum as well to add previous 2 numbers;

		if (n <= 1)
			return n;
		for (int i = 2; i <= n; i++) {

			sum = t0 + t1; // sum it
			t0 = t1;// change the positions to right
			t1 = sum;// change the positions to right

		}

		return sum;
	}

	/**
	 * A regular approach with direct fibanacci formula... This takes O(2^n)
	 * 
	 * @param n
	 * @return
	 */
	private static int fibRegular(int n) {

		if (n <= 1) {
			return n;
		}
		return fibRegular(n - 2) + fibRegular(n - 1);

	}

}
