package com.chandan.arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3,4,5,6};
		int rotate = 2;
		int []temp = new int[rotate];
		int count = 0;
		while(count<rotate) {
			temp[count] = arr[count];
			count++;
		}
		int length = ArrayUtil.length(arr);
		//shift left by two
		for(int i=0;i<length-2;i++) {
			arr[i] = arr[i+2];
		}
		//append temp
		for(int i = length-rotate,j = 0; i < length && j<rotate; i++,j++) {
			arr[i] = temp[j];
		}
		//shifted array
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
