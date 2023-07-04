package com.greatlearning.Driver;
import java.util.Scanner;

import com.greatlearning.Services.*;

public class Main {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of currency denominations");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.err.println("Enter the denomination values");
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount=s.nextInt();		
		
//		Sort the denomination array in descending order
		SortingImpl t = new SortingImpl();
		t.sort(arr);
		
//		Find the no of denominations
		NotesCount n = new NotesCount();
		n.notesCountImpl(arr, amount);
		
	}

}
