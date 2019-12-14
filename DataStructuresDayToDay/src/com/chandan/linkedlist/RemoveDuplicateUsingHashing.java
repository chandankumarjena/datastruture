package com.chandan.linkedlist;

import java.util.HashSet;

public class RemoveDuplicateUsingHashing {
	Node head;
	void addNode(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	void visit() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	void removeDuplicate() {
		HashSet<Integer> hs = new HashSet<Integer>();
		Node current = head;
		Node prev = null;
		
		while(current != null) {
			int current_value = current.data;
			if(hs.contains(current_value)) {
				prev.next = current.next;
			}else {
				hs.add(current_value);
				prev = current;
			}
			current = current.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateUsingHashing duplicateUsingHashing = new RemoveDuplicateUsingHashing();
		duplicateUsingHashing.addNode(100);
		duplicateUsingHashing.addNode(100);
		duplicateUsingHashing.addNode(200);
		duplicateUsingHashing.addNode(200);
		duplicateUsingHashing.addNode(300);
		duplicateUsingHashing.addNode(300);
		duplicateUsingHashing.addNode(400);
		duplicateUsingHashing.addNode(400);
		System.out.println("with duplicate");
		duplicateUsingHashing.visit();
		System.out.println("without duplicate");
		duplicateUsingHashing.removeDuplicate();
		duplicateUsingHashing.visit();
	}

}
