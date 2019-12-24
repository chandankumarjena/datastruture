package com.chandan.arrays;

public class BinarySearch {
	//using loop
	public int usingLoop(int []arr, int element, int start, int end) {
		int position = -1;
		while (start < end) {
			int mid = (start + end)/ 2;
			if(arr[mid] == element) {
				position = mid;
				break;
			} else if(element > arr[mid]) {
				start = mid +1;
			} else {
				end = mid -1;
			}
		}
		return position;
		
	}
	//using recursion
	
	public int usingRecursion(int []arr, int element, int start, int end) {
		
		if(arr.length == 0 || start > end) {
			return -1;
		}
		
		int mid = (start + end)/ 2;
		if(arr[mid] == element) {
			return mid;
		} else if(element > arr[mid]) {
			return usingRecursion(arr,element, mid+1, end);
		} else {
			return usingRecursion(arr,element, start, mid-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we need a sorted array
		BinarySearch binarySearch = new BinarySearch();
		int []array = {10,20,30,40,50,60,70,80,90};
		int length = array.length;
		int index = binarySearch.usingLoop(array, 50, 0, length - 1);
		if(index == -1) {
			System.out.println("element not present");
		} else {
			System.out.println("found at position"+ (index+1));
		}
		
		index = binarySearch.usingRecursion(array, 90 , 0, length - 1);
		if(index == -1) {
			System.out.println("element not present");
		} else {
			System.out.println("found at position"+ (index+1));
		}
	}

}
