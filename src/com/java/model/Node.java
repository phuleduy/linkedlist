/**
 * 
 */
package com.java.model;

/**
 * @author BH4Ljfe
 *
 */
/*
 * Node class
 * */
public class Node{
	//This variable is used to store data
	int data;
	//This is the next node element
	Node nextNode;
	//Constructor
	public Node(int data,Node nextNode){
       this.data = data;
       this.nextNode = nextNode;
    }
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	 
}
