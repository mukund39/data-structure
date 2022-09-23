package com.mukund.tree;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTree {

	BinaryTreeNode root;

	public void add(int data) {
		root = addRecursive(root, data);
	}

	public BinaryTreeNode addRecursive(BinaryTreeNode current, int data) {
		if (current == null) {
			return new BinaryTreeNode(data);
		}

		if (data < current.data)
			current.left = addRecursive(current.left, data);
		else if (data > current.data)
			current.right = addRecursive(current.right, data);
		else {
			return current;
		}
		return current;
	}
	
	public void preOrder(BinaryTreeNode node)
	{
		if(node != null)
		{
			System.out.print(node.data+" ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	public ArrayList<Integer> iterrativrPreorderTravarsal(BinaryTreeNode node)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(node == null)
		{
			return res;
		}
		
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		stack.push(node);
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode temp = stack.pop();
			res.add(temp.data);
			if(temp.right != null)
			{
				stack.push(temp.right);
			}
			
			if(temp.left != null)
			{
				stack.push(temp.left);
			}
			
		}
		return res;
	}
	public boolean findNode(BinaryTreeNode node, int data)
	{
		if(node == null)
		{
			return false;
		}
		if(data == node.data)
		{
			return true;
		}
		
		return data < node.data ? findNode(node.left, data) : findNode(node.right, data);
		
	}
	
	

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
			bt.add(6);
		    bt.add(4);
		    bt.add(8);
		    bt.add(3);
		    bt.add(5);
		    bt.add(7);
		    bt.add(9);
		bt.preOrder(bt.root);
		System.out.println();
		System.out.println(bt.findNode(bt.root, 15));
		System.out.println(bt.iterrativrPreorderTravarsal(bt.root));

	}

}
