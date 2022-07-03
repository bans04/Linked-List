package com.linkedlist;
/*
 * Lets create a simple Linked List of 56, 30 and 70
 * 
 * @ Dnyandeo Banosde
 * 
 * */

public class LinkedList {

	public static void main(String[] args) {
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
	}
}
