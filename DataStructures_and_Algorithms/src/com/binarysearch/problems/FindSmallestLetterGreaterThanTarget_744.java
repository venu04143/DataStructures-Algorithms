package com.binarysearch.problems;
/*You are given an array of characters letters that is sorted in non-decreasing order,
 *  and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target.
 If such a character does not exist, return the first character in letters.*/

public class FindSmallestLetterGreaterThanTarget_744 { // Leetcode 744

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] letters = { 'c', 'f', 'j' };
		char target = 'f';

		System.out.println(nextGreatestLetter(letters, target));

	}

	static char nextGreatestLetter(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < letters[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		if (start == letters.length) {
			return letters[0];
		}
		return letters[start];
	}

}
