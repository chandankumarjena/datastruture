package com.chandan.arrays;
/*
 * going to insert array element 
 *  at first 
 *  at any position
 *  at last
 */

public class ArrayInsertion {
	static int count;
	void insertAtFirst(int []arr,int element) {
		for(int i = count ; i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = element;
		count++;
		
	}
	void insertAtAnyPoisition(int []arr,int position,int element) {
		for(int i = count ; i > position; i--) {
			arr[i] = arr[i-1];
		}
		arr[position] = element;
		count++;
	}
	void insertAtLast(int []arr, int element) {
		arr[count] = element;
		count++;
	}
	void print(int []arr) {
		for (int i = 0; i < count;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayInsertion arrayInsertion = new ArrayInsertion();
		int []arr = new int[10];
		
		//insert some elements in to the array
		for(int i = 0; i < 5 ;i++) {
			arr[count++] = i+1;
		}
		//array elements are
		arrayInsertion.print(arr);
		
		// inserting 40 at first positions
		
		arrayInsertion.insertAtFirst(arr, 40);
		
		//after inserting 40 at first
		
		arrayInsertion.print(arr);
		
		//inserting at position 2 elemnt 50
		
		arrayInsertion.insertAtAnyPoisition(arr, 2, 50);
		
		//after insertion 50
		
		arrayInsertion.print(arr);
		
		//inserting at last 100
		arrayInsertion.insertAtLast(arr, 100);
		
		//after inserting 100
		
		arrayInsertion.print(arr);
		
	}

}



