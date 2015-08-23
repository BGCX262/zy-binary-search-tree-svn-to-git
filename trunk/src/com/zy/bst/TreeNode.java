package com.zy.bst;

public class TreeNode {
	public int data;
	public TreeNode left;
	public TreeNode right;
	public TreeNode parent;
	
	public TreeNode() {
		data = -1;
		left = null;
		right= null;
		parent = null;
	}
	public TreeNode(int data) {
		this.data = data;
		left = null;
		right= null;
		parent = null;
	}
}
