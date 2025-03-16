package com.linearsearch;

import java.util.Arrays;

public class LinearSearchOn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { 
				{ 23, 4, 1 },   
				{ 18, 12, 3, 9 }, 
				{ 78, 99, 34, 56 },
			};
		int target = 9;
		int[] ans = searchIn2D(arr, target);
		System.out.println(Arrays.toString(ans));
	}

	static int[] searchIn2D(int[][] arr, int target) {
		// TODO Auto-generated method stub
		if (arr.length == 0) {
			return new int[] { -1, -1 };
		}
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return new int[] { row, col };
				}
			}
		}
		return new int[] { -1, -1 };
	}

}
