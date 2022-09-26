package com.mukund.linkedstack;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
	
	LinkedList<Employee> stack;
	
	public LinkedStack()
	{
		stack = new LinkedList<>();
	}
	
	public void push(Employee employee) {
		stack.push(employee);
	}
	
	public Employee peek() {
		return stack.peek();
	}
	
	public Employee pop() {
		return stack.pop();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		ListIterator<Employee> itr = stack.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
