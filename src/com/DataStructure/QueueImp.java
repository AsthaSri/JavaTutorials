package com.DataStructure;

public class QueueImp {
	public static void main(String[] args) {
		Queue<Integer> l = new Queue<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.traverse(); 
		System.out.println("\nAfter Deleting Elements:");
		l.remove();
		l.remove();
		l.traverse();

	}

}
