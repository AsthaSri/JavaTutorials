package com.DataStructure;
import java.util.Scanner;

public class Linear_search {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,20,30,40,50,60,70,80,90};
		int element = 0;
		int index = 0;
		boolean flag = false;
		System.out.println("Enter Element to be found");
		element = sc.nextInt();
		sc.close();
		int n = arr.length;
		for(int j=0;j<n;j++){
			if(arr[j]==element){
				index = j;
				flag = true;
			}
		}
		index = index+1;
		if(flag){
			  System.out.println("The element " + element + " Found at " + index);
		} else {
			System.out.println("Element doesnot exist");
		}
	}

}
