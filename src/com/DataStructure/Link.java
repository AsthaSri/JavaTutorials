package com.DataStructure;

public class Link {
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d,Node n){
			data = d;
			next = n;
		}
	}
	
		public void add(int d){
			Node ptr = new Node(d,null);
		if(head == null){
			head = ptr;
		} 
		else {
			Node p = head;
			while(p.next != null){
				p = p.next;
				}
			p.next = ptr;
		}
	}
		public void remove(int d){
			if(head.data == d){
				head = head.next;
			}
			Node prev = head;
			Node cur = head;
			while(cur != null){
				if(cur.data == d){
					prev.next = cur.next;
				}
				cur = cur.next;
			}
		}
		
		public void traverse(){
			Node p =  head;
			while(p != null){
				System.out.println("Item = " + p.data);
				p = p.next;
			}
			
		}
}

