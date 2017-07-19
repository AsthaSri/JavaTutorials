package com.DataStructure;

public class AVLTree {
	static boolean taller;
	public Node root = null;
	class Node{
		Node lchild;
		int data;
		Node rchild;
		int bal;
		
		Node(){
			lchild = null;
			data = 0;
			rchild = null;
			bal = 0;
		}
	}
	
	public Node insert(Node p, int d){
		if(p == null){
			p = new Node();
			p.data = d;
			p.lchild = null;
			p.rchild = null;
			p.bal = 0;
			taller = true;
		}
		else if(p.data > d){
			p.lchild = insert(p.lchild, d);
			if(taller == true){ p = insert_left_check(p, taller); }
		}
		else  if(p.data < d){
			p.rchild = insert(p.rchild,d);
			if(taller == true){ p = insert_right_check(p, taller); }
		}
		else {
			System.out.println("Duplicate keys");
			taller = false;
		}
		return p;
	}
	
	public Node insert_left_check(Node p,boolean ptaller){
		switch(p.bal){
		case 0 : p.bal = 1;              // for balanced tree, now left heavy
		         break;
		case -1: p.bal = 0;              //balanced now
		         ptaller = false;
		         break;
		case 1 : p = insert_leftBal(p);
		         ptaller = false;
		}
		return p;
	}
	
	public Node insert_leftBal(Node p){
		Node ap = new Node();
		Node bp = new Node();
		ap = p.lchild;
		if(ap.bal == 1){
			p.bal = 0;
			ap.bal = 0;
			p = Rotate_Right(p);
		}
		else {
			bp = ap.rchild;
			switch(bp.bal){
			case -1: p.bal = 0;
			         ap.bal = 1;
			         break;
			case 1 : p.bal = -1;
			         ap.bal = 0;
			         break;
			case 0 : p.bal =0;
					 ap.bal = 0;
			}
			bp.bal = 0;
			p.lchild = Rotate_Left(ap);
			p = Rotate_Right(p);
		}
		return p;
	}
	
	public Node Rotate_Left(Node p){
		Node ap = new Node();
		ap = p.rchild;
		p.rchild = ap.lchild;
		ap.lchild = p;
		return ap;
	}
	
	public Node Rotate_Right(Node p){
		Node ap = new Node();
		ap = p.lchild;
		p.lchild = ap.rchild;
		ap.rchild = p;
		return ap;
	}
	
	public Node insert_right_check(Node p, boolean ptaller){
		switch(p.bal){
		case 0 : p.bal = -1;              
		         break;
		case 1 : p.bal = 0;              
		         ptaller = false;
		         break;
		case -1: p = insert_rightBal(p);
		         ptaller = false;
		}
		return p;
	}
	
	public Node insert_rightBal(Node p){
		Node ap = new Node();
		Node bp = new Node();
		ap = p.rchild;
		if(ap.bal == -1){
			p.bal = 0;
			ap.bal = 0;
			p = Rotate_Left(p);
		}
		else {
			bp = ap.lchild;
			switch(bp.bal){
			case -1: p.bal = 1;
			         ap.bal = 0;
			         break;
			case 1 : p.bal = 0;
			         ap.bal = -1;
			         break;
			case 0 : p.bal =0;
					 ap.bal = 0;
			}
			bp.bal = 0;
			p.lchild = Rotate_Right(ap);
			p = Rotate_Left(p);
		}
		return p;
	}
	
	public void inorder(Node p){
		if(p == null){
			return;
		}
		inorder(p.lchild);
		System.out.println("Item " + p.data);
		inorder(p.rchild);
	}
	
}































