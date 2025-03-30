package com.binarysearch.problems;

/* if target element exist return that or return next element
 * if target element is not exist and greater than last element in a array return -1;*/
public class CeilingOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 19;
		System.out.println(ceilingNumber(arr, target));

	}

	static int ceilingNumber(int[] arr, int target) {
		if (target > arr[arr.length - 1]) {
			return -1;
		}
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
		return start;
	}

}
