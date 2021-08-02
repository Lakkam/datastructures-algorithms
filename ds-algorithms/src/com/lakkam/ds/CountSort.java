package com.lakkam.ds;

/**
 * Index based sorting and time takes is O(n). It takes auxilory array based on
 * array of elements bigger value auxilory array size should be of size equal to
 * bigger element from original array and then, for element 2 from array a, 2nd
 * index of array b gets incremented It happens for all elements. After that, it
 * copies back the array B indexes to array a elements by decreasing the values
 * from array B
 * 
 * @author ranga
 *
 */
public class CountSort {

	public static void main(String[] args) {

		int a[] = { 9, 7, 4, 5, 1, 2 };
		int max = 9;
		int b[] = new int[max+1];// 9 is bigger element from array a

		for (int i = 0; i < b.length; i++) {
			b[i] = 0;
		}

		for (int j = 0; j < a.length; j++) {
			b[a[j]]++;
		}

		int p = 0, q = 0;
		while (p < max + 1) {

			if (b[p] > 0) {
				a[q++] = p;
				b[p]--;
			} else
				p++;

		}

		for (int x = 0; x < a.length; x++) {
			System.out.println(a[x]);
		}
	}

}
