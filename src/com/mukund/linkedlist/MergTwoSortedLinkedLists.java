package com.mukund.linkedlist;

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
	int data;
	Node next;
	Node(int d) {
			data = d;
			next = null;
			}
}

class LinkedList
{
	Node head, tail;

	LinkedList(){
		head = null;
		tail = null;
		}
	
	public void addNode(int new_data){
		Node temp = new Node(new_data);
		if(head == null){
			head = temp;
			tail = temp;
			}
		else{
			tail.next = temp;
			tail = temp;
			}
		}

	public void printLinkedList(Node headNode)
	{
		Node temp = headNode;
		if(headNode != null){
			while(temp.next != null){
				System.out.print(temp.data + " ");
				temp = temp.next;
				}
			System.out.print(temp.data);
			}	
	}

	public Node reverseMergeSortedLinkedLists(Node node1, Node node2)
	{
	    
	    
	    Node temp3 = null;
	    while(node1!= null && node2 != null){
	            if(node1.data <= node2.data){
	               Node temp= node1.next;
	               node1.next = temp3;
	               temp3= node1;
	               node1= temp;
	            }else {
	            	 Node temp= node2.next;
	            	 node2.next = temp3;
	            	 temp3 = node2;
	            	 node2 = temp;
	            }

	        
	    }
	    while(node1 != null)
	    {
	    	Node temp= node1.next;
	    	node1.next = temp3;
            temp3= node1;
            node1= temp;
	    }
	    
	    while(node2 != null)
	    {
	    	Node temp= node2.next;
	    	node2.next = temp3;
       	 temp3 = node2;
       	node2 = temp;
	    }
	    
	    
		// Write code for the function below
		// return the head of the modified Linked List
		return temp3;
	}
}

public class MergTwoSortedLinkedLists
{
	public static void main (String[] args) throws java.lang.Exception{
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();
        LinkedList ll3 = new LinkedList();
		Node mergedLinkedListHead;
		Scanner in = new Scanner(System.in);
		int sizeOfLinkedList1, sizeOfLinkedList2, value;

		// Read input from stdin
		sizeOfLinkedList1 = in.nextInt();
		sizeOfLinkedList2 = in.nextInt();
		for(int i=0;i<sizeOfLinkedList1;i++){
			value = in.nextInt();
			ll1.addNode(value);
		}
		for(int i=0;i<sizeOfLinkedList2;i++){
			value = in.nextInt();
			ll2.addNode(value);
		}
		mergedLinkedListHead = ll3.reverseMergeSortedLinkedLists(ll1.head,ll2.head);

		// Print output to console
		ll3.printLinkedList(mergedLinkedListHead);
	}
}