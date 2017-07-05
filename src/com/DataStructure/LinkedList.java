package com.DataStructure;

public class LinkedList {

	public static void main(String[] args) {

		int data[] = {10,20,40,12,44,90};
		Object[][] linklist = new Object[1][2];
		create(data,linklist);
		print(linklist);
	}

	private static void print(Object[][] linklist) {
		Object node[][] = null;
		node = linklist;
		node = (Object[][]) node[0][1];
		while(node[0][1]!=null){
			System.out.print(node[0][0] + "--->");
			node = (Object[][])node[0][1];
		}
		System.out.println("null");
	}

	private static void create(int[] data, Object[][] linklist) {
		Object node[][] = null;
		Object newNode[][] = null;
		node = new Object[1][2];
		linklist[0][1] = node;
		for(int i=0;i<data.length;i++){
			node[0][0] = new Integer(data[i]);
			newNode = new Object[1][2];
			node[0][1] = newNode;
			node = newNode;
		}
		node = null;
		newNode = null;
		
	}

}
