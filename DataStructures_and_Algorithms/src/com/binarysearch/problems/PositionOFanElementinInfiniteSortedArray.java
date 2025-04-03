package com.binarysearch.problems;

public class PositionOFanElementinInfiniteSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		int target = 19;
		
		int ans = startAndEndRange(arr,target);
		System.out.println(ans);
	}
	static int startAndEndRange(int[] arr,int target) {
		int start = 0;
		int end =1;
		
		while(target>arr[end]) {
			int newStart = end+1;
			
			end=end+(end-start+1)*2;
			
			if(end>arr.length) {
				end=arr.length-1;
			}
			
			start=newStart;	
		}
		return binarySearch(arr,target,start,end);
	}
	static int binarySearch(int[] arr, int target,int start,int end) {

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
		return -1;
	}

}
