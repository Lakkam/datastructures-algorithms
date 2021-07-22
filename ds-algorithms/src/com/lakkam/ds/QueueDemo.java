package com.lakkam.ds;

class Queue {
	int arrayQ[];
	int front = -1;
	int rear = -1;
	int size = 0;

	public Queue(int dynamicSize) {
		this.size = dynamicSize;
		arrayQ = new int[dynamicSize];
	}

	public void enQueue(int e) {
		if (rear == size - 1) {
			System.out.println("Queue is full...");
		} else {
			rear++;
			arrayQ[rear] = e;
		}
	}

	public void deQueue() {
		if (rear == front) {
			System.out.println("Queue is empty..");
		} else {
			front++;
			arrayQ[front] = 0;

		}
	}
}

public class QueueDemo {

	public static void main(String[] args) {
		Queue myQueue = new Queue(4);
		myQueue.enQueue(1);
		myQueue.enQueue(2);
		myQueue.enQueue(3);
		myQueue.enQueue(4);

		displayQueue(myQueue);
		myQueue.deQueue();
		displayQueue(myQueue);

	}

	private static void displayQueue(Queue myQueue) {
		System.out.println("Priting queue elemets");
		int[] arrayQ = myQueue.arrayQ;
		for (int i = 0; i < arrayQ.length; i++) {
			System.out.println(arrayQ[i]);
		}

	}

}
