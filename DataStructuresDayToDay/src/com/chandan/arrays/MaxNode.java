package com.chandan.arrays;

public class MaxNode {
	class Node{
		int key;
		Node left;
		Node right;
		Node(int key){
			this.key = key;
			left =right = null;
		}
	}
	Node root;
	MaxNode(){
		root = null;
	}
	void insert(int key) {
		root = insertRecord(root,key);
	}

	private Node insertRecord(Node root2, int key) {
		// TODO Auto-generated method stub
		if(root2 == null) {
			root2 = new Node(key);
			return root2;
		}
		
		if(key < root2.key) {
			root2.left = insertRecord(root2.left, key);
		}
		if(key> root2.key) {
			root2.right = insertRecord(root2.right, key);
		}	
		return root2;
	}
	void findMaxNode() {
		System.out.println(intFindMaxNode(root));
	}
	
	private int intFindMaxNode(Node root2) {
		// TODO Auto-generated method stub
			if(root2.right == null)
				return root2.key;
		return intFindMaxNode(root2.right);
	}
	void findMinNode() {
		System.out.println(intFindMinNode(root));
	}
	
	private int intFindMinNode(Node root2) {
		// TODO Auto-generated method stub
			if(root2.left == null)
				return root2.key;
		return intFindMaxNode(root2.left);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxNode binarySearchTree = new MaxNode();
		binarySearchTree.insert(50);
		binarySearchTree.insert(30);
		binarySearchTree.insert(20);
		binarySearchTree.insert(40);
		binarySearchTree.insert(70);
		binarySearchTree.insert(60);
		binarySearchTree.insert(80);
		
		binarySearchTree.findMaxNode();
		binarySearchTree.findMinNode();

	}
}











