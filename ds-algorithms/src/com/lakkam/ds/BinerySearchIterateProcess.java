package com.lakkam.ds;

public class BinerySearchIterateProcess {

	public static void main(String[] args) {

		int[] inputArray = { 3, 6, 9, 12, 14, 19, 22 };
		int key = 20;

		int low = 0;
		int high = inputArray.length;

 		while (low <= high) {

			int mid = (low + high) / 2;
			if (key == inputArray[mid]) {
				System.out.println("Element Found at index: " + mid);
			}

			if (key < inputArray[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

	}

}
