package com.DataStructure;

public class Queue<T> {
Node<T> front;
	class Node<T>{
		T data;
		Node<T> next;
		
		Node(T d,Node<T> n){
			data = d;
			next = n;
		}
	}
	
	public void add(T d){
		Node<T> ptr = new Node<T>(d,null);
		if(front == null){
			front = ptr;
		} 
		else {
			Node<T> p = front;
			while(p.next != null){
				p = p.next;
				}
			p.next = ptr;
		}
	}
	
	public void remove(){
		if(front == null){
			System.out.println("Empty List");
		}
		else{
			System.out.println("Item deleted: " + front.data);
			front = front.next;
		}
	}
	
	public void traverse(){
		Node<T> p =  front;
		while(p != null){
			System.out.println("Item = " + p.data);
			p = p.next;
		}
	}
}
