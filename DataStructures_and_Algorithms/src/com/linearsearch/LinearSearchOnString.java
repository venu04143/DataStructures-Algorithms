package com.linearsearch;

public class LinearSearchOnString {
	
	// 1st method
	static boolean searchTarget(String str,int target) {
		if(str.length()==0) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==target) {
				return true;
			}
		}
		return false;
	}
	
	// 2nd method
	static boolean searchTarget2(String str,int target) {
		if(str.length()==0) {
			return false;
		}
		for(char ch : str.toCharArray()) {
			if (ch==target) return true;
		}
	
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="Venu Gopal";
		char target ='G';
		
		System.out.println(searchTarget(name,target));
	}

}
