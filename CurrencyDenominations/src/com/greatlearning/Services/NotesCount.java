package com.greatlearning.Services;

public class NotesCount {
	public void notesCountImpl(int arr[], int amount) {
		int noteCounter[] = new int[arr.length];
		try {
			for(int i=0;i<arr.length;i++) {
				if(amount>=arr[i]) {
					noteCounter[i]=amount/arr[i];
					amount=amount-noteCounter[i]*arr[i];
				}
			}
			if(amount>0) {
				System.out.println("Exact amount cant be paid with highest denominations");
			}else {
				System.out.println("Your payment approach in order to give the min no of notes will be");
				for(int i=0;i<arr.length;i++) {
					if(noteCounter[i]!=0) {
					System.out.println(arr[i]+":"+noteCounter[i]);
					}
				}
			}
			
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		
	}
}
