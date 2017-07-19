package com.DataStructure;

public class BTree {
	public Node root = null;
	class Node{
		int data;
		Node lchild;
		Node rchild;
		
		Node(int d){
			this.data = d;
		}
	}
	
	public void preorder(Node p){
		if(p == null){
			return;
		}
		System.out.println("Item " + p.data);
		preorder(p.lchild);
		preorder(p.rchild);
	}
	
	public void inorder(Node p){
		if(p == null){
			return;
		}
		inorder(p.lchild);
		System.out.println("Item " + p.data);
		inorder(p.rchild);
	}
	
	public void postorder(Node p){
		if(p == null){
			return;
		}
		postorder(p.lchild);
		postorder(p.rchild);
		System.out.println("Item " + p.data);
	}
	
	public void insert(int value){
		if(root == null){
			root = new Node(value);
		}
		Node ptr = root;
		while (ptr.data != value){
			if(ptr.data > value){
				if(ptr.lchild == null){
					ptr.lchild = new Node(value);
					return;
					}
				ptr = ptr.lchild;
			} else if(ptr.rchild == null){
		                ptr.rchild = new Node(value);
		                return;
		            }
		            ptr = ptr.rchild;
		        }
		    }
	public void remove(int val){
		Node par = null;
		Node ptr = root;
		while(ptr != null){
			if(val == ptr.data){ break;	}
			par = ptr;
			if(val < ptr.data) { ptr = ptr.lchild; }
			else { ptr = ptr.rchild; }
		}
		if(ptr == null) { System.out.println("Element not present"); }
		else if(par == null){ root = null; }
		else if(ptr == par.lchild){ par.lchild = null; }
		else par.rchild = null;
	}
	}
