package com.chandan.linkedlist;

public class RemoveLastNode {
	class Node{
		int data;
		Node next;
		Node(int key){
			data = key;
			next = null;
		}
	}
	Node head;
	void createNode(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	void visit() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + ",");
			temp =temp.next;
		}
	}
	void removeLastNode() {
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveLastNode lastNode = new RemoveLastNode();
		lastNode.createNode(10);
		lastNode.createNode(20);
		lastNode.createNode(30);
		lastNode.createNode(40);
		lastNode.createNode(50);
		System.out.println("before remove list is");
		lastNode.visit();
		System.out.println();
		System.out.println("after remove list is");
		lastNode.removeLastNode();
		lastNode.visit();
	}

}
