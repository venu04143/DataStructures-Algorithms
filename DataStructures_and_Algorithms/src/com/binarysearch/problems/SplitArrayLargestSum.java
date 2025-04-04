package com.binarysearch.problems;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 7, 2, 5, 8, 10 };
		int m = 2;

		int splitArray = largestSum(arr, m);
		System.out.println(splitArray);

	}

	static int largestSum(int[] arr, int m) {
		int start = 0;
		int end = 0;

		for (int i = 0; i < arr.length; i++) {
			start = Math.max(start, arr[i]);
			end += arr[i];
		}
		while (start < end) {
			int mid = start + (end - start) / 2;

			int sum = 0;
			int pieces = 1;

			for (int num : arr) {
				if (num + sum > mid) {
					sum = num;
					pieces++;
				} else {
					sum += num;
				} 
			}
			if (pieces > m) {
				start = mid + 1;
			} else {
				end = mid;
			}

		}
		return end;
	}

}
