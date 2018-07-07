package com.sample.ds.stack.linkedlist;

import java.util.Scanner;

public class StackWithLL {

	private Node top;

	/**
	 * stack operations
	 */

	public void push(int data) {
		top = new Node(data, top);
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println(top.data + " is poped from stack");
			top = top.nextNode;

		} else {
			System.out.println("stack is empty");
		}
	}

	public void peek() {
		if (!isEmpty()) {
			System.out.println(top.data);
		} else {
			System.out.println("stack is empty");
		}
	}

	public void show() {
		if (top != null) {
			Node node = top;
			while (node != null) {

				System.out.print(" " + node.data);
				node = node.nextNode;
			}
		}else {
			System.out.println("No element in the stack");
		}
	}

	public int stackCount() {
		int count = 0;
		Node currentNode = top;
		while (currentNode != null) {
			count++;
			currentNode = currentNode.nextNode;

		}
		return count;
	}

	public boolean isEmpty() {
		return top == null ? true : false;
	}

	public int search(int searchData) {
		return 0;
	}

	private int getOperationData(Scanner scanner) {
		System.out.println("\nEnter the data");
		return scanner.nextInt();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		OperationMenu menu = new OperationMenu();
		StackWithLL stackInstance = new StackWithLL();
		int choice = 0;
		do {
			menu.showMenu();
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				stackInstance.push(stackInstance.getOperationData(scanner));

				break;
			case 2:
				stackInstance.pop();
				break;
			case 3:
				System.out.println(stackInstance.isEmpty() ? "stack is empty" : "stack is not empty");
				break;
			case 4:
				stackInstance.peek();
				break;
			case 5:
				System.out.println("Total count of the stack is:" + stackInstance.stackCount());
				break;
			case 6:
				stackInstance.search(stackInstance.getOperationData(scanner));
				break;

			default:
				break;
			}
		} while (choice < 7);

	}

	static class OperationMenu {

		public void showMenu() {
			System.out.println("Stack operations\n");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.Is Empty");
			System.out.println("4.Peek");
			System.out.println("5.stack count");
			System.out.println("6.search");
			System.out.println("Enter your choice\n");
		}
	}

}
