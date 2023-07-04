package com.greatlearning.services;

public class TransactionServiceImpl {
	public void search(int arr[], long target) {
		long sum=0;
		boolean flag =false;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum>=target) {
				flag=true;
				System.out.println("Target acheived after "+(i+1)+" transaction");
				System.out.println();
				break;
			}
		}
		if(!flag) {
			System.out.println("Target not achieved");
		}
	}
	public void search1(int arr[], long target) {
		int cs[]=new int[arr.length];
		int total=0;
		for(int i=0;i<arr.length;i++) {
			total+=arr[i];
			cs[i]=total;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(cs[i]);
			
		}
	
//		boolean flag =false;
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//			if(sum>=target) {
//				flag=true;
//				System.out.println("Target acheived after "+(i+1)+" transaction");
//				System.out.println();
//				break;
//			}
//		}
//		if(!flag) {
//			System.out.println("Target not achieved");
//		}
	}
}
