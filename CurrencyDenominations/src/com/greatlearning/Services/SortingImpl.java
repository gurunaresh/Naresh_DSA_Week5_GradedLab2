package com.greatlearning.Services;

public class SortingImpl{
//	Implementation of bubble sort algorithm to arrange the array in descending order
	public void sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr.length-i-1;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
