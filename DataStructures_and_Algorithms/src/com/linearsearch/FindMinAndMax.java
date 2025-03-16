package com.linearsearch;

public class FindMinAndMax {
	
	static void findMinandMax(int[] arr) {
		if(arr.length==0) {
			System.out.println("Array is Empty");
		}
		int min=arr[0];
		int max =arr[0];
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			else if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Minimum Value in a Given Array is : "+ min);
		System.out.println("Maximum Value in a Given Array is : "+ max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {18,12,-7,3,14,28};
		findMinandMax(arr);

	}

}
