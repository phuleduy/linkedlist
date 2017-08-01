package com.java.main;

import com.java.model.LinkedList;

public class ExecuteClass {

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.addFirst(1);
		linkedlist.addFirst(2);
		linkedlist.addFirst(3);
		linkedlist.addFirst(6);
		linkedlist.addFirst(4);
		linkedlist.addFirst(15);
		linkedlist.addFirst(2);
		//Before I remove the tail of the list
		System.out.println("Before I remove the tail of the list");
		linkedlist.print();
		linkedlist.removeTail();
		System.out.println("After I remove the tail of the list");
		//After I remove the tail of the list
		linkedlist.print();
		linkedlist.removeElemntByTargetValue(14);
		System.out.println("Remove all element that is greater than a target value");
		linkedlist.print();
	}

}
