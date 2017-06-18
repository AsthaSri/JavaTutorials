package com.DataStructure;

public class Exponential_Search {
static BinarySearch BS = new BinarySearch();
	public static void main(String args[]){
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int len = arr.length;
		int element = 50;
		int result = exponentialSearch(arr,len,element);
		String answer = (result == -1)?"Element not present":("Element present at " + result);
		System.out.println(answer);
	}

	private static int exponentialSearch(int[] arr, int len, int element) {
		if(arr[0] == element)
			return 0;
		int i =1;
		while(i<len && arr[i] <= element)
			i = i*2;
		
		return BS.binarySearch(arr, i/2, Math.min(i, len), element);
	}
} 
