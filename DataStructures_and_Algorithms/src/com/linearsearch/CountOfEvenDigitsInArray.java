package com.linearsearch;

public class CountOfEvenDigitsInArray {  // leetcode 1295. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {18,9,1765,56,3,768,23};
		
		System.out.println(evenDigitsCount(arr));
      
		//System.out.println(countOfDigits(12));
	}

	static int evenDigitsCount(int[] arr) {
		if(arr.length==0) {
			return -1;
		}
		int count=0;
		for(int num : arr) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}

	static boolean even(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count%2==0;
	}
	
	static int countOfDigits(int num) {
		return (int)(Math.log10(num)+1);
	}

}
