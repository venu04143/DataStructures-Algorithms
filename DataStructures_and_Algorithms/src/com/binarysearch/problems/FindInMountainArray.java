package com.binarysearch.problems;

public class FindInMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,5,3,2,1};
		int target =3;
		//System.out.println(orderAgnosticBinarySearch(arr,target,0,arr.length-1));
		System.out.println(mountainArray(arr,target));

	}
	static int mountainArray(int[] arr,int target) {
		int peek=peekElement(arr);
		int firstTry=orderAgnosticBinarySearch(arr,target,0,peek);
		if(firstTry!=-1) {
			return firstTry;
		}
		return orderAgnosticBinarySearch(arr,target,peek,arr.length-1);
	}
	static int peekElement(int[] arr) {
		int start =0;
		int end =arr.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			
			if(arr[mid]>arr[mid+1]) {
				end=mid;
			}else {
				start=mid+1;
			}
		}
		return start;
	}

	static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
		boolean isAsc = arr[start] > arr[end];
		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (isAsc) {
				if (arr[mid] < target) {
					start = mid + 1;
				} else if (arr[mid] > target) {
					end = mid - 1;
				}
			} else {
				if (arr[mid] < target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
			if (arr[mid] == target) {
				return mid;
			}

		}
		return -1;
	}

}
