package com.lakkam.ds;

import java.util.Arrays;

public class ArraysConcepts {

	public static void main(String[] args) {

		int a[];
		int[] b = new int[10];
		int c[] = { 1, 6, 3, 8, 5 };
		int d[] = new int[10];

		// initialization...and putting some elements
		a = new int[] { 22, 33, 89, 90 };
		// append
		// append(a, 76);
		sort(c);

	}

	private static void sort(int[] c) {
		for (int i = 0, j = i + 1; i < (c.length - 1); i++, j++) {
			if (c[i] > c[j]) {
				c = swap(c, i, j);

			}
		}

		System.out.println("Array after sorting : ");
		for (int m = 0; m < c.length; m++) {
			System.out.println(c[m]);
		}

	}

	private static int[] swap(int[] c, int i, int j) {
		// TODO Auto-generated method stub
		int temp = 0;
		temp = c[i];
		c[i] = c[j];
		c[j] = temp;

		return c;

	}

	private static void append(int[] a, int i) {

		// if(a.)
		int length = a.length;
		if (length != 0)
			a[length++] = i;

		System.out.println(a);

	}

}
