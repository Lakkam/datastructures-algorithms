package com.lakkam.ds;

public class Merging {

	public static void main(String[] args) {

		int a[] = { 2, 5, 8, 12, 3, 6, 7, 10 };
		// int b[] = { 10, 1, 4, 9 };

		int m = a.length;
		int l = 0;

		int mid = (l + m) / 2;
		// int n = b.length;

		int c[] = new int[m];
		int i = 0;
		int j = mid;
		int k = l;
		while (i < mid && j < m) {

			if (a[i] < a[j]) {
				c[k++] = a[i++];
			} else
				c[k++] = a[j++];
		}

		for (; i < mid; i++) {
			c[k++] = a[i];
		}
		for (; j < m; j++) {
			c[k++] = a[j];
		}

		for (int p = 0; p < c.length; p++) {
			System.out.println(c[p]);
		}

	}

}
