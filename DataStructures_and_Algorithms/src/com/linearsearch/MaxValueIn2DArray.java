package com.linearsearch;


public class MaxValueIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {
				         {22,43,12,65},
				         {87,45,32,98},
				         {12,89,35,100},
		               
				};
		
		int ans=findMax(arr);
		System.out.println("Maximum value in Given 2D Array is : "+ ans);
	}
	// approach 1
	
	static int findMax(int[][] arr) {
		if(arr.length==0) {
			return Integer.MIN_VALUE;
		}
		int max =Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		return max;
	}
	
	// second approach 
	
	static int findMax2(int[][]TwoD) {
		if(TwoD.length==0) {
			return -1;
		}
		int max =Integer.MIN_VALUE;
		
		for(int[] OneD: TwoD) {
			for(int value:OneD) {
				if(value>max) {
					max=value;
				}
			}
		}
		return max;
	}

}
