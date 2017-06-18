package com.DataStructure;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkProgram {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(); 
		list.add("Astha");
		list.add("Monika");
		list.add("Shreya");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
