package com.lakkam.ds;

class BSTRecursive {

	BSTNode recursiveInsert(BSTNode root, int key) {
		BSTNode temp = null;
		// If there are no nodes in BST
		if (root == null) {
			temp = new BSTNode(null, key, null);
			root = temp;
			return root;
		}
		// The below is search and find the place for inserting..
		if (key < root.data) {
			root.left = recursiveInsert(root.left, key);
		} else if (key > root.data) {
			root.right = recursiveInsert(root.right, key);
		}

		return root;
	}

	public void preOrder(BSTNode p) {

		if (p != null) {
			System.out.println(p.data);
			preOrder(p.left);
			preOrder(p.right);
		}

	}

	public void inOrder(BSTNode p) {

		if (p != null) {

			inOrder(p.left);
			System.out.println(p.data);
			inOrder(p.right);
		}

	}

	/**
	 * This is for deletion of node based on some conditions
	 * 
	 * @param p
	 * @param key
	 * @return
	 */
	public BSTNode recursiveDelete(BSTNode root, int key) {

		if (root == null) {
			System.out.println("Nothing to delete..");
			return null;
		}

		// If there are no childrens then make root as null and return the same
		if (root.left == null && root.right == null) {
			root = null;
			return root;
		}

		if (key < root.data) {
			root.left = recursiveDelete(root.left, key);
		} else if (key > root.data) {
			root.right = recursiveDelete(root.right, key);
		}

		else {
			BSTNode q = null;
			/**
			 * Like IOS node..we can get IOP as well by sending root.left..Its our choice.
			 */
			q = getIOS(root.right);// Taking in-order-successor to replace the deleted node.
			root.data = q.data; // Replace root data with IOS data
			root.right = recursiveDelete(root.right, q.data); // perform delete on q whcih is a leaf node
		}

		return root;
	}

	/**
	 * This is to get in-order-successor. left most node of right sub tree.
	 * 
	 * @param right
	 * @return
	 */
	private BSTNode getIOS(BSTNode rightTree) {

		while (rightTree.left != null) {
			rightTree = rightTree.left;
		}

		return rightTree;
	}

	/**
	 * This is to get the in-order-predecessor. That is right most node of left tree
	 * 
	 * @param leftTree
	 * @return
	 */
	private BSTNode getIOP(BSTNode leftTree) {

		while (leftTree.right != null) {
			leftTree = leftTree.right;
		}
		return leftTree;
	}

	/**
	 * This is to find height of the left tree or right tree whcih ever is greater
	 * 
	 * @param left
	 * @return
	 */
	private int heightOfTree(BSTNode tree) {
		int leftTreeHeight = 0;
		leftTreeHeight = heightOfTree(tree.left) + 1;
		int rightTreeHeight = 0;
		rightTreeHeight = heightOfTree(tree.right) + 1;
		return leftTreeHeight > rightTreeHeight ? (leftTreeHeight) : (rightTreeHeight);
	}

	/**
	 * This is for count of all nodes..
	 * 
	 * @param p
	 * @return
	 */
	int countOfNodes(BSTNode p) {

		if (p != null) {
			int leftTreeHeight = countOfNodes(p.left);
			int rightTreeHeight = countOfNodes(p.right);

			// return countOfNodes(p.left) + countOfNodes(p.right) + 1;
			return leftTreeHeight > rightTreeHeight ? (leftTreeHeight + 1) : (rightTreeHeight + 1);
		}

		return 0;
	}

}

public class BSTLinkedListRecursiveDemo {
	static BSTNode root = null;

	public static void main(String[] args) {
		BSTRecursive bst = new BSTRecursive();

		root = bst.recursiveInsert(root, 20);
		bst.recursiveInsert(root, 30);
		bst.recursiveInsert(root, 10);
		bst.recursiveInsert(root, 15);
		bst.recursiveInsert(root, 40);
		bst.recursiveInsert(root, 5);

		bst.inOrder(root);
		root = bst.recursiveDelete(root, 20);
		System.out.println("After deleting...");
		bst.inOrder(root);
	}

}
