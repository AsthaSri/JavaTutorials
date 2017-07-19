package com.DataStructure;

public class AVLTree_Imp {

	public static void main(String[] args) {
		AVLTree avt = new AVLTree();
		avt.root = avt.insert(avt.root,30);
		avt.root = avt.insert(avt.root,20);
		avt.root = avt.insert(avt.root,10);
		avt.root = avt.insert(avt.root,40);
		avt.root = avt.insert(avt.root,2);
		avt.root = avt.insert(avt.root,100);
		avt.inorder(avt.root);
 
	}

}
