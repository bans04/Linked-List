package com.linkedlist;
/*
 * Lets create a simple Linked List of 56, 30 and 70
 * Ability to create Linked List by adding 30 and 56 to 70
 * 
 * @ Dnyandeo Banosde
 * 
 * */

public class LinkedList {
	Node head;

	public void addNodeMethod(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			head = newNode;
			newNode.next = temp;
		}
	}
	
	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {
			while (temp != null) {
				System.out.println(temp.data + "->");
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		obj.addNodeMethod(70);
		obj.addNodeMethod(30);
		obj.addNodeMethod(56);
		obj.display();
	}
}
