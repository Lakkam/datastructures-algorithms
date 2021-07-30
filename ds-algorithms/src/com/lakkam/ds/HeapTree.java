package com.lakkam.ds;

public class HeapTree {

	/**
	 * Heap creation will call insert for each array element
	 * 
	 * @param a
	 */
	static void createHeap(int a[]) {
		// We have to initiate from second value onwards..so that i/2 logic will work
		// properly...
		for (int i = 2; i < a.length; i++) {

			insertToHeap(a, i);

		}
	}

	/**
	 * Insert will run based on its parent element and run till it satisfies parent
	 * should be greater than to its children for max heap
	 * 
	 * @param a
	 * @param i
	 */
	private static void insertToHeap(int[] a, int i) {

		int temp = a[i];
		while (i > 1 && temp > a[i / 2]) {

			a[i] = a[i / 2];
			i = i / 2;
		}
		a[i] = temp; // Finally insert the element to its desired location

	}

	public static void main(String[] args) {
		int a[] = { 0, 10, 20, 30, 25, 5, 40, 35 }; // Taking array elements from 0 helps us to maintain single array
													// and can start the logic from 2nd element onwards
		createHeap(a);
		//// 40,25,35,10,5,20,30

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		for (int i = a.length - 1; i > 1; i--) {
			System.out.println("Delete values from Heap" + deleteFromHeap(a, i));
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
 		}

		// Create heap with heapify
		int b[] = {5,10,30,20 };
		heapify(b);
		for (int i = 0; i < b.length; i++) {
			System.out.println("Heapify : "+b[i] + ",");
		}

	}

	/**
	 * Heapify works from last element in an array and we dont need to take any
	 * actions for leaf nodes becasue leaf nodes by default does not have any
	 * childrens and they satisfy heap property
	 * 
	 * This works for min heap...
	 * 
	 * So, we have to start from parent of last leaf node Number of leaf nodes in a
	 * BH is (n+1)/2. Parent of last leaf node is (n-1)/2. So, we can start the loop
	 * iteration from n-1/2 index and decrease the index
	 * 
	 * @param a
	 */
	private static void heapify(int[] a) {
		// { 0, 10, 20, 30, 25, 5, 40, 35 }
		int n = (a.length);
		for (int i = ((n - 1) / 2); i > 0; i--) {

			int j = (2 * i);// for left child
			if (a[j + 1] > a[j]) {
				j = j + 1;
			}
			if (a[i] < a[j]) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;

				//i = j;
				//j = (2 * i)+1;

			} else
				break;

		}

	}

	private static int deleteFromHeap(int[] a, int n) {
		// 40,25,35,10,5,20,30
		int i = 1;
		int j = 2 * i;
		int val = a[1];
		a[1] = a[n]; // Take last element to first index

		// and then start delete logic of comparing root childrens and swapping the
		// element

		while (j < n - 1) {
			// If root right child is greater than left child
			// move j to right child location otherwise, it will be at 2*i whcih is left
			// child position
			if (a[j + 1] > a[j]) {
				j = j + 1;
			}
			/*
			 * If root element is less than its child, then swap
			 */
			if (a[i] < a[j]) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;

				// Move i position and j position after swap
				i = j;
				j = 2 * j; // Basically to its left child position for further iteration.

			} else
				break;
		}

		// Store the deleted val to last index of array
		/**
		 * This is for Heap Sort.
		 */
		a[n] = val;

		return val;

	}

}
