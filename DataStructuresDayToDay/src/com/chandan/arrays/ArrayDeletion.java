package com.chandan.arrays;

public class ArrayDeletion {
	static int count;
	void deleteFromFirst(int []arr) {
		for(int i = 0;i < count;i++ ) {
			arr[i] = arr[i+1];
		}
		count --;
	}
	void deleteFromAnyPosition(int []arr, int position) {
		if(position > count) {
			System.out.println("then deletion is not possible");
		} else {
			for(int i = position;i < count;i++) {
				arr[i] = arr[i+1];
			}
			count --;
		}
	}
	void deleteFromLast() {
		count --;
	}
	void print(int []arr) {
		for(int i = 0; i < count ;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {10,20,30,40,50,60,70,80,90,100};
		count = arr.length;
		ArrayDeletion arrayDeletion = new ArrayDeletion();
		// delete an element from last
		arrayDeletion.deleteFromLast();
		arrayDeletion.print(arr);
		
		//delete from first
		arrayDeletion.deleteFromFirst(arr);
		arrayDeletion.print(arr);
		
		//delete from any position
		arrayDeletion.deleteFromAnyPosition(arr, 3);
		arrayDeletion.print(arr);
	
	}

}
