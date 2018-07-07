package com.sample.ds.stack.linkedlist;

public class QueueWithLL {

	Node head;
	Node firstNode;

	public void enque(int data) {
		head = new Node(data, head);
		if (isEmpty()) {

			firstNode = head;
		}

	}

	public void deque() {
		if (!isEmpty()) {
			Node nextNode = firstNode.nextNode;
			firstNode = null;
			firstNode = nextNode;
		}else {
			System.out.println("Queue is empty");
		}

	}
	
	public void show() {
		if(!isEmpty()) {
			Node node = firstNode;
			while(node != null) {
				System.out.println(node.data);
				node = node.nextNode;
			}
		}
	}
	
	private boolean isEmpty() {
		return firstNode == null? true:false;
	}

}
