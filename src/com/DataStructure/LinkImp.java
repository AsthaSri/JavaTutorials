package com.DataStructure;

public class LinkImp {

	public static void main(String[] args) {
		Link l = new Link();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.traverse(); 
		System.out.println("\nAfter Removing Elements:");
		l.remove(10);
		l.remove(30);
		l.traverse();

	}

}
