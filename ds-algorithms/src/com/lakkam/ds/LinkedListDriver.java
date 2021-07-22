package com.lakkam.ds;

import java.util.LinkedList;

class Node {

	int data;
	Node next;

	public Node() {
	}

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

}

class MyLinkedList<E> {

	static Node first = null;// This is for head pointer
	static Node last = null;

	public MyLinkedList() {

	}

	public static MyLinkedList insert(MyLinkedList list, int data) {
		// Create a new node with given data
		Node new_node = new Node(data, null);
		new_node.next = null;

		// If the Linked List is empty,
		// then make the new node as head
		if (list.first == null) {
			list.first = new_node;
		} else {
			// Else traverse till the last node
			// and insert the new_node there
			last = list.first;
			while (last.next != null) {
				last = last.next;
			}

			// Insert the new_node at last node
			last.next = new_node;
		}

// Return the list by head
		return list;
	}

	private boolean checkIndex(int index) {

		return index >= 0 ? true : false;

	}

}

public class LinkedListDriver {

	public static void main(String[] args) {

		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();

		myList = myList.insert(myList, 1);
		myList = myList.insert(myList, 2);
		myList = myList.insert(myList, 3);
		// myList.add(2);
		// myList.add(3);
		Node listNodes = myList.first;
		while (listNodes != null) {

			System.out.println(listNodes.data);
			listNodes = listNodes.next;

		}

	}

}
