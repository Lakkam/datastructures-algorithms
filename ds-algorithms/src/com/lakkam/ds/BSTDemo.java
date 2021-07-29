package com.lakkam.ds;

class BSTNode {
	BSTNode left;
	int data;
	BSTNode right;

	public BSTNode(BSTNode left, int data, BSTNode right) {
		super();
		this.left = left;
		this.data = data;
		this.right = right;
	}

}

class BST {
	BSTNode root = null;

	void insert(int key) {
		// root=node;
		BSTNode r = null; // This is for tail pointer to maintain the last node details to identify where
							// to insert
		BSTNode p = null;// This is for root node data holding
		BSTNode t = root;// This is for loop through root node and search for an element. So that we can
							// retain the root as it is
		if (root == null) {
			p = new BSTNode(null, key, null);
			root = p;
			return;
		}

		while (t != null) {
			r = t;

			if (key == t.data) {
				System.out.println(root.data + " : Node already available. BST will not create duplicate nodes..");
				// return root;
			}

			if (key < t.data) {
				t = t.left;
			} else if (key > t.data) {
				t = t.right;
			} else {
				return;
			}

		}

		// Now t points at null and r points at end location where we can insert new
		// node..So this addition to r node will modify the root data as well and root
		// holds all the nodes
		p = new BSTNode(null, key, null);
		if (p.data < r.data) {
			r.left = p;
		} else {
			r.right = p;
		}

	}

	void preOrder(BSTNode node) {

		if (node != null) {
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}

}

public class BSTDemo {

	public static void main(String[] args) {
		// BSTNode node = null;
		BST bst = new BST();
		bst.insert(20);
		bst.insert(10);
		bst.insert(30);
		bst.insert(5);
		bst.insert(25);
		// node=bst.insert(node, 20);
		bst.preOrder(bst.root);

	}

}
