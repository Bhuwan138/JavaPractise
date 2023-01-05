package com.Other.Array;

class BuildArrayFromPermutation{
	public static void main(String []args){
		int []nums= {0,2,1,5,3,4};
		int n = nums.length;
		int []ans = new int[n];
		for(int i=0;i<nums.length;i++){
			ans[i] = nums[nums[i]];
			System.out.print(ans[i] +" ");
		}
		
		
	}
}