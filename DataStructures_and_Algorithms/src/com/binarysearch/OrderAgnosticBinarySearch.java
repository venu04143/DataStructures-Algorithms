package com.binarysearch;

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 3, 5, 8, 9, 12, 14, 20, 33 };
		int[] arr2 = { 33, 20, 14, 12, 9, 8, 5, 3, 1 };

		int target = 20;
		int indexPosition = orderAgnostic(arr2, target);
		System.out.println(indexPosition);

	}

	static int orderAgnostic(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		boolean isAsc = arr[start] < arr[end];
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (arr[mid] < target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (arr[mid] < target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}

}
