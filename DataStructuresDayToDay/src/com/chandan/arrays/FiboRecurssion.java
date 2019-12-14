package com.chandan.arrays;

public class FiboRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =9;
		System.out.println(fib(n));
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n <= 1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}

}
