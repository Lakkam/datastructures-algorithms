package com.lakkam.ds;

/**
 * Quick Sort works based on divide and conqur rule by partitioning the array
 * like finding the index of an element where all of its left side elements are
 * smaller and right side elements are bigger
 * 
 * After identifying the partitioning index, we need to divide the array and
 * sort left side elements and right side elements..
 * 
 * This algo is recursive in nature and we will use recursive approach only
 * 
 * @author ranga
 *
 */
public class QuickSort {

	public static void main(String[] args) {

		int a[] = { 9, 10, 5, 4, 2,12,24, Integer.MAX_VALUE };
		int l = 0;
		int h = a.length - 1;
		performQuickSort(a, l, h);
		for (int p = 0; p < a.length; p++) {
			System.out.println(a[p]);
		}

	}

	private static void performQuickSort(int[] a, int l, int h) {

		if (l < h) {
			int mid = partitionArray(a, l, h);
			performQuickSort(a, l, mid); //for left side portion
			performQuickSort(a, mid + 1, h); //for right side portion.
		}

	}

	private static int partitionArray(int[] a, int l, int h) {

		int pivot = a[l];
		// will use i for bigger elements by traversing in incremental order
		// will use j for smaller elements by traversing in decremental order
		int i = l, j = h;
		// 9, 10, 5, 4, 2, 6

		while (i < j) {
			do {
				i++;
			} while (a[i] <= pivot);// for traversing upward
			do {
				j--;
			} while (a[j] > pivot); // for traversing downward

			if (i < j)
				swap(a, i, j); // for swapping elements
		}
		swap(a, l, j); // If array size is not even, then some elements will be remaining either at
						// left or right...so, we need to swap those
		return j; //finally return the actual partitioning index
	}

	private static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;

	}

}
