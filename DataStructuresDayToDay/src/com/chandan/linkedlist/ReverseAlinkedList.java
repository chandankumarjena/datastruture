package com.chandan.linkedlist;

/*
 * logic to reverse a list
 * 	1.have three node prev, curr,next
 *	2. when curr is starting node then prev will be null
 *	3. assign curr.next to prev to reverse list
 *	4. increament both prev and curr
 */
public class ReverseAlinkedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	Node head;
	public void addNode(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	void visit() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	void reverseList() {
		Node prev = null,curr,next = null;
		curr = head;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAlinkedList alinkedList = new ReverseAlinkedList();
		alinkedList.addNode(100);
		alinkedList.addNode(200);
		alinkedList.addNode(300);
		alinkedList.addNode(400);
		
		System.out.println("before reverse");
		alinkedList.visit();
		
		alinkedList.reverseList();
		
		System.out.println("before reverse");
		alinkedList.visit();
		
		
	}

}












