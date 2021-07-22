package com.lakkam.ds;

class Stack {
	int stackArray[];
	int top = -1;
	int size = 0;

	public Stack(int dynamicSize) {
		this.size = dynamicSize;
		stackArray = new int[dynamicSize];
	}

	public void push(int e) {
		if (stackArray != null) {

			if (top == size - 1) {
				System.out.println("Stack is Full..");
			} else {
				top++;
				stackArray[top] = e;
			}
		}
	}

	public void pop() {

		if (stackArray != null) {
			if (top == -1) {
				System.out.println("Stack is empty..");
			} else {
				stackArray[top] = 0;
				top--;
			}
		}

	}
}

public class StackDemo {

	public static void main(String[] args) {
		Stack myStack = new Stack(4);

		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		// myStack.push(5);

		displayStack(myStack);
		myStack.pop();
		displayStack(myStack);

	}

	private static void displayStack(Stack myStack) {
		System.out.println("Printing stack elements...");
		if (myStack != null) {
			int[] stackArray = myStack.stackArray;
			for (int i = 0; i < stackArray.length; i++) {
				System.out.println(stackArray[i]);
			}

		}

	}
}
