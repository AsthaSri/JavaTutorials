package com.DataStructure;

public class SelSort {

	public static void main(String[] args) {
		int arr[] = { 65, 54, 54, 87, 42, 20, 2 };
		int i, j, temp;
		int x = arr.length;
		for (i = 0; i < x - 1; i++) {
			for (j = i + 1; j < x; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("the sorted array is ");
		for (i = 0; i < x; i++)
			System.out.print(arr[i] + " ");

	}

}
