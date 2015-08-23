package com.zy.bst;

public class BinarySearchTree {
	int data[] = new int[20];
	TreeNode treeRoot;
	
	public BinarySearchTree() {
		for(int i=0; i<20; i++) {
			data[i] = i;
		}
		RandomHelper.RandomizeArray(data);
		treeRoot = null;
	}
	
	public void Build() {
		treeRoot = new TreeNode(this.data[0]);
		for(int i=1; i<20; i++) {
			TreeNode node = new TreeNode(this.data[i]);
			insert(treeRoot, node);
		}
	}
	
	public TreeNode Search(int k) {
		TreeNode p = treeRoot;
		while(p!=null&&p.data!=k) {
			if(k<p.data) {
				p = p.left;
			} else {
				p = p.right;
			}
		}
		return p;
	}
	
	private void insert(TreeNode tree, TreeNode node) {
		if(tree==null) {	//如果还是一棵空树
			//tree.data = node.data;
			System.out.println("error：null tree");
			return;
		}

		if(node.data<tree.data) {
			if(tree.left==null) {
				tree.left = node;
				node.parent = tree;
			} else {
				insert(tree.left, node);
			}
		} else {
			if(tree.right==null) {
				tree.right = node;
				node.parent = tree;
			} else {
				insert(tree.right, node);
			}
		}
	}
	
	public void inOrderWalk() {
		inwalk(this.treeRoot);
	}
	private void inwalk(TreeNode node) {
		if(node!=null) {
			inwalk(node.left);
			System.out.print(node.data+"\t");
			inwalk(node.right);
		}
	}
	
	public void showData() {
		for(int i=0; i<20; i++) {
			System.out.print(this.data[i]+"\t");
		}
	}
}
