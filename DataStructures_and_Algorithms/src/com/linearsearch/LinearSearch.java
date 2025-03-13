package com.linearsearch;

/*
 * Search in the array : return the index if element found
 * Otherwise if element not found return (-1) Integer Min_Value
 * There might be a chance that -1 will be in the array */

public class LinearSearch {
	
	static int linearSearch(int[] arr,int target) {
		// array length is 0.Means array is empty 
		if(arr.length==0) {
			return -1;
		}
		for(int index =0;index<arr.length;index++) {
			if(arr[index] == target) {
				// element is found and return it index position
				return index;
			}
		}
		// if element not found return ;
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,6,7,8};
		int target = 9;
		
		//System.out.println(linearSearch(arr,target));
		
		int ans =linearSearch(arr,target);
		System.out.println(ans);

	}

}
