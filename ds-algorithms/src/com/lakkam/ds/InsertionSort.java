package com.lakkam.ds;

/**
 * A sort which will pick each array element and insert in sorted position by
 * comparing it with its predecessor This will be done in 2 loops. So time
 * complexity is O(n^2)
 * 
 * @author ranga
 *
 */
public class InsertionSort {

	public static void main(String[] args) {

		int a[] = { 8, 7, 5, 6, 4, 3 };

		int n = a.length;
		for (int i = 1; i < n; i++) {
			int key = a[i];
			int j = i - 1;

			//This loop has to happen till comparision fails and till j becomes -1
			while (j > -1 && a[j] > key) {

				// Its not swapping and its just virtual shifting the positions.
				a[j + 1] = a[j];
				j--;
			}
			// after completion of this while loop and when condition fails, then we have to
			// insert the picked element to the position

			a[j + 1] = key;

		}

		for (int k = 0; k < n; k++)
			System.out.println(a[k]);
	}

}
