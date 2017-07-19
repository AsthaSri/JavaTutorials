package com.DataStructure;

public class Btreeimp {

	public static void main(String[] args) {
		BTree rt = new BTree();
		rt.insert(20);
		rt.insert(10);
		rt.insert(30);
		rt.insert(40);
		System.out.println("PreOrder Traversal");
		rt.preorder(rt.root);
		System.out.println("InOrder Traversal");
		rt.inorder(rt.root);
		System.out.println("PostOrder Traversal");
		rt.postorder(rt.root);
		System.out.println("Deleting Element");
		rt.remove(20);
		rt.inorder(rt.root);
	}

}
