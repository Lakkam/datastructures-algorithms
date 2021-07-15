package com.lakkam.ds;

public class BinarySearchRecursiveProcess {

	public static void main(String[] args) {

		int[] inputArray = { 4, 5, 9, 12, 19, 22, 29 };
		int key = 1;
		int low = 0;
		int high = inputArray.length;
		int searchIndex = binarySearchRecursive(inputArray, key, low, high);
		if(searchIndex==-1) {
			System.out.println("Element not found...");
		}else {
			System.out.println("Element found at : "+searchIndex);
		}

	}

	private static int binarySearchRecursive(int[] inputArray, int key, int low, int high) {

		if (low == high) {
			if (key == inputArray[low]) {
				return low;
			} else {
				return -1;
			}
		} else {

			int mid = (low + high) / 2;
			if (key == inputArray[mid]) {
				return mid;
			}

			if (key < inputArray[mid]) {
				return binarySearchRecursive(inputArray, key, low, mid - 1);
			} else {
				return binarySearchRecursive(inputArray, key, mid + 1, high);
			}

		}

	}

}
