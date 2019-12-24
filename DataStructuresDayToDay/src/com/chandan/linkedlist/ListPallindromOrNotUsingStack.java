package com.chandan.linkedlist;

import java.util.Stack;
class Node1{
	int data;
	Node1 next;
	Node1(int data){
		this.data = data;
		next = null;
	}
}
public class ListPallindromOrNotUsingStack {
	
	public static boolean checkForPalondrome(Node1 node1) {
		Stack<Integer> stack = new Stack<Integer>();
		Node1 first = node1;
		Node1 second = node1;
		boolean status = false;
		while(first != null) {
			stack.push(first.data);
			first = first.next;
		}
		System.out.println();
		while(second != null) {
			int top = stack.pop();
			if(top == second.data) {
				status = true;
			} else {
				status = false;
				break;
			}
			second = second.next;
		}
		return status;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node1 node1 = new Node1(1);
		Node1 node2 = new Node1(2);
		Node1 node3 = new Node1(3);
		Node1 node4 = new Node1(2);
		Node1 node5 = new Node1(1);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		boolean status = checkForPalondrome(node1);
		if(status) {
			System.out.println("pallindrome");
		}else {
			System.out.println("not pallindrome");
		}
	}
}








