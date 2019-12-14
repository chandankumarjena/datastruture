package com.chandan.linkedlist;

public class SimpleList {
	class Node{
		int key;
		Node next;
		Node(int key){
			this.key = key;
			next = null;
		}
	}
	Node head;
	void createList(int key) {
		Node newNode = new Node(key);
		newNode.next = head;
		head = newNode;
	}
	void visitList() {
		Node temp = head;
		while(temp.next != null) {
			System.out.println(temp.key);
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleList list = new SimpleList();
		list.createList(100);
		list.createList(200);
		list.createList(300);
		list.createList(400);
		list.createList(500);
		list.visitList();
	}
}
