package com.DataStructure;

import java.util.Scanner;

public class TOH {
	
	public void solve(int n,String start,String aux,String end){
		if(n==1){
			System.out.println(start + "->" + end);
		}else {
			solve(n-1,start,end,aux);
			System.out.println(start + "->" + end);
			solve(n-1,aux,start,end);
		}
	}

	public static void main(String[] args) {
		TOH toh = new TOH();
		Scanner sc = new Scanner(System.in);
		int disk;
		System.out.println("Enter the number of disk: ");
		disk = sc.nextInt();
		sc.close();
		toh.solve(disk, "A", "B", "C");

	}

}
