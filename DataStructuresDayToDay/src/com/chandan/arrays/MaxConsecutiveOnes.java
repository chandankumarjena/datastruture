package com.chandan.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* One binary array is there and find the maximum of consecutive ones.
 * Ex arr = [1,1,0,0,0,1,1,1,1], output = 4
 * Note - The input array will contain only 0 and 1
 * Time Complexity:- O(n)
 * 
 * */
public class MaxConsecutiveOnes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 	
		// enter the size of array
        int n = Integer.parseInt(br.readLine()); 
        int []arr = new int[n];
        //binary array reading
		String line = br.readLine(); 
        String[] strs = line.trim().split("\\s+");
		for(int i=0; i<n; i++) {
	        int num = Integer.parseInt(strs[i]); 
		    arr[i] = num;
		}
		int maxLength = getMaxConsecutiveOnes(arr);
		System.out.println(maxLength);

	}

	private static int getMaxConsecutiveOnes(int[] arr) {
		// TODO Auto-generated method stub
		int currentMax = 0, max = 0;
		for (int n : arr) {
			max = Math.max(max, currentMax = n == 0 ? 0 : currentMax + 1);
		}
		return max;
	}

}
