package com.DataStructure;

public class Stack<T> {
	Node<T> top;
	
	class Node<T>{
		T data;
		Node<T> next;
		
		Node(T d, Node<T> n){
			data = d;
			next = n;
		}
	}
		
	public void push(T a){
		Node<T> ptr = new Node<T>(a,null);
		if(top == null){
			top = ptr;
		}
		else{
			ptr.next = top;
			top = ptr;
			}
			
		}
	public T pop(){
		T d = null;
		if(top == null){
			System.out.println("Empty List");
		}
		else{
			d = (T) top.data;
			top = top.next;
		}
		return d;
	}
	public void traverse(){
		Node<T> p =  top;
		while(p != null){
			System.out.println("Item = " + p.data);
			p = p.next;
		}
	}
	}


