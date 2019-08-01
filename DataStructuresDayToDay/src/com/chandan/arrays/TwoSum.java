package com.chandan.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*find two index position of an array whose value addition equal to a certain number
 * example  array = [1, 2 , 3, 4, 5], target = 9
 * return [3, 4] not present result will [0, 0]
 * Note:- no same element can't use twice
 * Time Complexity:- O(N)
 */

public class TwoSum {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 	
		// enter the size of array
        int n = Integer.parseInt(br.readLine()); 
        // enter the target
        int target = Integer.parseInt(br.readLine());
	    int []arr = new int[n];
		String line = br.readLine(); 
        String[] strs = line.trim().split("\\s+");
		for(int i=0; i<n; i++) {
	        int num = Integer.parseInt(strs[i]); 
		    arr[i] = num;
		}
		int []resultArray = getIndexPosition(arr, n, target);
		System.out.println("[" + resultArray[0] +","+ resultArray[1] +"]");
	}

	private static int[] getIndexPosition(int[] arr, int n, int target) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> mapper = new HashMap<Integer,Integer>();
		for(int i = 0; i < n; i++) {
			// if map contains the element then found otherwise add
			Integer diff = mapper.get(target - arr[i]);
			if(diff == null) {
				mapper.put(arr[i],i);
			} else {
				arr[0] = diff;
				arr[1] = i;
			}
		}
		return arr;
	}

}




