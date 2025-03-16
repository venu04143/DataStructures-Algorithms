package com.linearsearch;

public class LinearSearchInRage {
	
	static int linearSearch(int[] arr,int target,int start,int end) {
		// array length is 0.Means array is empty 
		if(arr.length==0) {
			return -1;
		}
		for(int index =start;index<=end;index++) {
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

		int[] arr = {18,12,-7,3,17,28};
		int target =3;
		
		System.out.println(linearSearch(arr,target,1,4));
	}

}
