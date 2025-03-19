package com.linearsearch;

public class MaxWelth { // leetcode 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] accounts = { {1,2,3},{9,1,6},{5,3,1}};
	   System.out.println(maximumWelth(accounts));

	}
	
	public static int maximumWelth(int[][]accounts) {
		int maxWelth=0;
		for(int person=0;person<accounts.length;person++) {
			int accountSum=0;
			for(int account=0;account<accounts[person].length;account++) {
				accountSum+=accounts[person][account];
			}
			if(accountSum>maxWelth) {
				maxWelth = accountSum;
			}
		}
		return maxWelth;
	}

}
