/**
 * 
 */
package com.java.model;

import java.util.NoSuchElementException;

/**
 * @author BH4Ljfe
 *
 */
public class LinkedList {
	// Head element
	Node head;

	public LinkedList() {
		this.head = null;
	}

	/*
	 * return true if the list is empty
	 */
	public boolean isEmpty() {
		return this.head == null;
	}

	/*
	 * Inserts a new node at the beginning of this list.
	 */
	public void addFirst(int item) {
		head = new Node(item, head);
	}

	/*
	 * Returns the first element in the list.
	 */
	public int getFirst() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		return head.data;
	}

	/*
	 * Remove the tail element from the list
	 */
	public void removeTail() {
		if (head == null) {
			throw new RuntimeException("cannot delete");
		}
		Node cur = head;
		Node prev = null;
		while (cur.getNextNode() != null) {
			prev = cur;
			cur = cur.getNextNode();
		}
		// delete tail node
		prev.setNextNode(null);
	}

	/*
	 * Remove all element in the linked list that is great than a target value
	 */
	public void removeElemntByTargetValue(int targetValue) {
		if (head == null) {
			throw new RuntimeException("cannot delete");
		}
		Node cur = head;
		Node prev = null;
		/* Take care of the case where leading nodes are value to be deleted */
		while (cur != null && cur.getData() > targetValue) {
			prev = cur;
			cur = cur.getNextNode();
			head = cur;
			prev = null;
		}
		/*
		 * At the end of above loop our new head is known which makes things
		 * simpler
		 */
		/* Now we traverse the list from left to right */
		while (cur != null) {
			if (cur.getData() > targetValue) {
				prev.setNextNode(cur.getNextNode());
				cur = prev.getNextNode();
			} else {
				prev = cur;
				cur = cur.getNextNode();
			}
		}
	}

	/*
	 * Print out the list
	 */
	public void print() {
		Node cur = head;
		while (cur != null) {
			System.out.println(cur.data);
			cur = cur.getNextNode();
		}
	}
}
