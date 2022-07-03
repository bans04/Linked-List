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
	Node tail;

	//add method
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
	
	//append method
    public void append(int data) {
        Node nextNode = new Node(data);
        if (head == null) {
            head = nextNode;
            tail = nextNode;
        } else {
            tail.next = nextNode;
            tail = tail.next;
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
		obj.append(56);
		obj.append(30);
		obj.append(70);
		obj.display();
	}
}
