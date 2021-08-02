package com.lakkam.ds;

/**
 * A sort by moving the bubble by comparing each each element with its
 * successor... It will happen in iterative eay with 2 loops Since it has 2
 * loops, time complexity is O(n^2)
 * 
 * @author ranga
 *
 */
public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 8, 7, 5, 3, 4 };
		int n = a.length;
		// First loop for passes
		for (int i = 0; i < n; i++) {
			// Second loop for comparisions and swapping. J is j<n-1-i, becasue we need to
			// stop swapping on already sorted elements
			for (int j = 0; j < n - 1 - i; j++) {

				if (a[j + 1] < a[j]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}

			}
		}

		for (int k = 0; k < a.length; k++)
			System.out.println(a[k]);

	}

}
