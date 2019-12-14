package com.chandan.arrays;

public class BinarySearchTree {
	class Node{
		int key;
		Node left,right;
		public Node(int data) {
			key = data;
			left = right = null;
		}
	}
	Node root;
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	void insert(int key) {
		root = insertRecord(root, key);
	}
	//method to insert a node.
	//if root is null then add at root
	// if less then root add as left child
	// if more than root add as right child
	private Node insertRecord(Node root2, int key) {
		// TODO Auto-generated method stub
		if(root2 == null) {
			root2 = new Node(key);
			return root2;
		}
		//if key less then root than element will be added left to the node
		if(key < root2.key) {
			root2.left = insertRecord(root2.left, key);
		} else if(key > root2.key) {
			//if key greater than root then element will be added left to the node
			root2.right = insertRecord(root2.right, key);
		}
		return root2;
	}
	public void inOrderVisit() {
		inorderVisitTree(root);
	}
	//inorder visit
	void inorderVisitTree(Node root2) {
		// TODO Auto-generated method stub
		if(root2 != null) {
			inorderVisitTree(root2.left);
			System.out.print(root2.key +" ");
			inorderVisitTree(root2.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.insert(50);
		binarySearchTree.insert(30);
		binarySearchTree.insert(20);
		binarySearchTree.insert(40);
		binarySearchTree.insert(70);
		binarySearchTree.insert(60);
		binarySearchTree.insert(80);
		
		binarySearchTree.inOrderVisit();
	}
}