package com.zy.bst;

public class BSTtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.showData();
		System.out.println();
		bst.Build();
		bst.inOrderWalk();
		TreeNode node = bst.Search(13);
		if(node==null) {
			System.out.println("No such node");
		} else {
			System.out.println(node.data);
		}
	}
}
