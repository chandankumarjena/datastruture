package com.chandan.linkedlist;

import java.util.HashSet;

public class FindLoopInAList {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	Node head;
	void addNode(int data) {
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
	boolean detectLoop() {
		HashSet<Node> s = new HashSet<FindLoopInAList.Node>();
		Node temp = head;
		while(temp != null) {
			if(s.contains(temp)) {
				return true;
			}
			s.add(temp);
			temp = temp.next;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindLoopInAList aList = new FindLoopInAList();
		aList.addNode(100);
		aList.addNode(200);
		aList.addNode(300);
		aList.addNode(400);
		aList.addNode(400);
		aList.visit();
		aList.head.next.next.next.next = aList.head;
		
		if(aList.detectLoop())
			System.out.println("loop is there");
		else
			System.out.println("no loop");
	}
}
