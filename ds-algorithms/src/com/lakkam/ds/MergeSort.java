package com.lakkam.ds;

/**
 * Exactly like quick sort. It works based on divide and conqur. So, we finds
 * mid index and use 2-way merging by taking 2 elements at time recursive merge
 * sort for left side array recursive merge sort for right side array then
 * merging of all elements recursively
 * 
 * Time - O(nlogn) Space - O(n+logn) for additional stack since it is recursive
 * -logn approach and additional auxilory array since it use extra array for
 * merging - n *
 * 
 * @author ranga
 *
 */
public class MergeSort {

	public static void main(String[] args) {

		int a[] = { 10, 0, 8, 9, 2, 7 };

		int l = 0;
		int h = a.length - 1;
		performMergeSort(a, l, h);
		
		for (int p = 0; p < a.length; p++) {
			System.out.println(a[p]);
		}

	}

	/**
	 * Recursive merge sort method which uses tail merging and post order merging.
	 * So, merge function is after 2 sort calls
	 * @param a
	 * @param l
	 * @param h
	 */
	private static void performMergeSort(int[] a, int l, int h) {
		
		
		if (l < h) {
			int mid = (l + h) / 2;
			performMergeSort(a, l, mid);
			performMergeSort(a, mid + 1, h);
			merging(a, l, mid, h);
		}

	}

	/**
	 * Merging of elements from single array using divide and conqur approach with mid
	 * @param a
	 * @param l
	 * @param mid
	 * @param h
	 */
	private static void merging(int[] a, int l, int mid, int h) {

		int c[] = new int[a.length];
		int i = l;
		int j = mid+1;
		int k = l;
		while (i <= mid && j <= h) {

			if (a[i] < a[j]) {
				c[k++] = a[i++];
			} else
				c[k++] = a[j++];
		}

		for (; i <= mid; i++) {
			c[k++] = a[i];
		}
		for (; j <= h; j++) {
			c[k++] = a[j];
		}
		
		for(int x=l;x<=h;x++) {
			a[x]=c[x];
		}

	}

}
