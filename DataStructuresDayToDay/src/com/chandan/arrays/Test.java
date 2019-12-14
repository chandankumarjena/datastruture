package com.chandan.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	
	public static void main(String []args) {
		int []arr = {3,6,8,11,14};
		int N =5;
		int K = 3;
		int []tempArray = new int[100];
        int []permanentArray = new int[N];
	    int m = 0,n = 0;
	        for(int i = 0;i < N;i++){
	           tempArray[m]=arr[i];
	            m++;
	            int count = 0;
	         for(int j = i+1;j < N;j++){
	             if(arr[j] == arr[j-1]+K){
	            	 tempArray[m]=arr[j];
	            	 m++;
	             }else {
	            	 break;
	             }
	         } 
	         for(int j:tempArray) {
	        	 if(j > 0) {
	        		 count++;
	        	 }
	         }
	         permanentArray[n]=count;
	         n++;
	         Arrays.fill(tempArray, 0);
	        }
	        for(int i: permanentArray) {
	        	System.out.println(i);
	        }		
	}

}
