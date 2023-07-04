package com.greatlearning.driver;
import java.util.Scanner;

import com.greatlearning.services.TransactionServiceImpl;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the transaction");
		int size = sc.nextInt();
		System.out.println("Enter the values for the array");
		int arr[] = new int[size];
//		enter the value for the array
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the total number of targets for the day");
		int tnum = sc.nextInt();
		int i=1;
		while(i<=tnum) {
			System.out.println("Enter the target "+i+" value");
			long target = sc.nextLong();
			TransactionServiceImpl t = new TransactionServiceImpl();
			t.search1(arr, target);
			i++;
		}
		
	}
}
