package com.linkedlist;
/*
 * Lets create a simple Linked List of 56, 30 and 70
 * Ability to create Linked List by adding 30 and 56 to 70
 * Ability to insert 30 between 56 and 70
 * Ability to delete the first element in the LinkedList of sequence 56->30->70
 * Ability to delete the last element in the LinkedList of sequence 56->30->70
 * Ability to search LinkedList to find Node with value 30
 * 
 * @ Dnyandeo Bansode
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
    
    //insert method
	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = tail.next;
		}
	}
    
    //insert between method
	public void insertBetweenNode(int a, int b, int c) {
		Node newNode = new Node(c);
		Node temp = head;
		while (temp.next != null) {
			if ((temp.data == a && temp.next.data == b) || (temp.data == a && temp.next.data == b)) {
				Node afterc = temp.next;
				temp.next = newNode;
				temp.next.next = afterc;
				break;
			}
			temp = temp.next;
		}
	}
	
	//pop method
	public void pop() {
		Node temp = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			head = temp.next;
		}
	}
	
	//delete last element
	public void popLastNode() {
		Node temp = head;
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {
			while (temp.next != tail) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
		}
	}
	
	//search method
	public void search(int data) {
		Node temp = head;
		int index = 0;
		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			while (temp != null) {
				index++;
				if (temp.data == data) {
					System.out.println("Node is present at " + index +" position");
					break;
				} else {
					temp = temp.next;
				}
			}
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
		obj.search(30);
	}
}
