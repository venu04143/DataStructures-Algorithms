package com.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
		int target = 36;

		int indexPosition = binarySearch(arr, target);
		System.out.println(indexPosition);
	}

	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
