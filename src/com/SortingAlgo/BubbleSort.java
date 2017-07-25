package com.SortingAlgo;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 65, 54, 54, 87, 42, 20, 2 };
		int x = arr.length;
		int i,j,temp;
		for(i=0;i<x;i++){
			for(j=0;j<x-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("The sorted array is ");
		for(i=0;i<x;i++)
			System.out.println(arr[i] + " ");
	}

}
