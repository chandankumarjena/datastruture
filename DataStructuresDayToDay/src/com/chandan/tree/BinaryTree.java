package com.chandan.tree;

public class BinaryTree {
	Node root;
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new Node(1);
		binaryTree.root.left = new Node(2);
		binaryTree.root.right = new Node(3);
		binaryTree.root.left.left = new Node(4);
	}

}
