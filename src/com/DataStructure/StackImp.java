package com.DataStructure;

public class StackImp {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.traverse();
		System.out.println("Item Deleted " + st.pop());
		System.out.println("Item Deleted " + st.pop());
		st.traverse();

	}

}
