package com.chandan.arrays;
interface First{
	void proc1();
	void proc2();
}
interface Second extends First{
	void proc3();
}
public class FiboDynamic implements Second {
	
	
	static int fib(int n) {
		int []f = new int[n+2];
		int i;
		f[0] = 0;
		f[1] = 1;
		for(i = 2;i <= n; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		System.out.println(fib(n));
		
		Integer var1 = new Integer(24);
		Integer var2 = new Integer(24);
		System.out.println(var1==var2);
		System.out.println(var1.equals(var2));
		FiboDynamic dynamic = new FiboDynamic();
		dynamic.proc1();
		dynamic.proc2();
		dynamic.proc3();
		
	}

	@Override
	public void proc1() {
		// TODO Auto-generated method stub
		System.out.println("python");
	}

	@Override
	public void proc2() {
		// TODO Auto-generated method stub
		System.out.println("java");
	}

	@Override
	public void proc3() {
		// TODO Auto-generated method stub
		System.out.println("php");
	}

}
