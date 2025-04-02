package com.binarysearch.problems;

import java.util.Arrays;

public class FirstandLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,7,7,7,7,7,7,8,8,8};
		int target=7;
		
		int[]positions =firstAndLast(arr,target);
		System.out.println(Arrays.toString(positions));
	}

	static int[] firstAndLast(int[] arr,int target) {
		int[] ans= {-1,-1};
		
		int firstOccurencePosition = binarySearch(arr,target,true);
		int secondOccurencePosition=binarySearch(arr,target,false);
		
		ans[0]=firstOccurencePosition;
		ans[1]=secondOccurencePosition;
		return ans;
	}
	
	static int binarySearch(int[] arr,int target,boolean findFirstPosition) {
		int ans=-1;
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]<target) {
				start=mid+1;
			}
			else if(arr[mid]>target) {
				end =mid-1;
			}
			else {
				ans = mid;
				if(findFirstPosition) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}
		}
		return ans;
	}
}
