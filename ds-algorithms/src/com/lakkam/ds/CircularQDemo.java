package com.lakkam.ds;

class CQueue {
	int arrayQ[];
	int front = 0;
	int rear = 0;
	int size = 0;

	public CQueue(int dynamicSize) {
		this.size = dynamicSize;
		arrayQ = new int[dynamicSize];
	}

	public void enQueue(int e) {
		if (arrayQ != null) {
			if (((rear + 1) % size) == front) {
				System.out.println("Queue is full..");
			} else {
				rear = (rear + 1) % size;
				arrayQ[rear] = e;
			}
		}
	}

	public void deQueue() {
		if (arrayQ != null) {
			if (front == rear) {
				System.out.println("Queue is empty..");
			} else {
				front = (front) + 1 % size;
				arrayQ[front] = 0;
			}
		}
	}

}

public class CircularQDemo {

	public static void main(String[] args) {
		CQueue myQueue = new CQueue(4);
		myQueue.enQueue(1);
		myQueue.enQueue(2);
		myQueue.enQueue(3);
		//myQueue.enQueue(4);// In CQ, if the size is 4, then we can insert only 3 elements..the front
							// pointing element is always empty or 0.

		System.out.println("Displaying queue elements firsttime..");
		displayQueue(myQueue);
		System.out.println("Deleting queue elements...");
		myQueue.deQueue();
		myQueue.deQueue();
		displayQueue(myQueue);
		System.out.println("Again inserting queue elements...");
		myQueue.enQueue(1);
		myQueue.enQueue(2);
		displayQueue(myQueue);
		

	}

	private static void displayQueue(CQueue myQueue) {
		int[] arrayQ = myQueue.arrayQ;
		for (int i = 0; i < arrayQ.length; i++) {
			System.out.println(arrayQ[i]);
		}

	}

}
