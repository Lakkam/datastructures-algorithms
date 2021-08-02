package com.lakkam.ds;

/**
 * Selection sort works by using 3 pointers to array where i,j and k pointing to
 * 0 index j will traverse through the array and find any smaller element than
 * k, if yes, call k to that location...It performs this till it fails the
 * comparision condition. Once it stops, then swap i and k elements. This gives
 * us, bigger element goes to last.
 * 
 * This iterates the array 2 times through nested loops with O(n^2)
 * 
 * @author ranga
 *
 */
public class SelectionSort {

	public static void main(String[] args) {

		int a[] = { 8, 7, 0, 1, 3, 2 };
		int j, k;
		for (int i = 0; i < a.length; i++) {
			for (j = k = i; j < a.length; j++) {

				if (a[j] < a[k]) {
					k = j;
				}

			}

			swap(a, i, k);
		}

		for (int p = 0; p < a.length; p++) {
			System.out.println(a[p]);
		}

	}

	private static void swap(int a[], int x, int y) {

		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;

	}

}
