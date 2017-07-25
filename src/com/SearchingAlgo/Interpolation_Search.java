package com.SearchingAlgo;

public class Interpolation_Search {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int len = arr.length;
		int element = 50;
		int result = interpolation(arr, len, element);

		if (result != -1) {
			System.out.println("Element found at "+ result);
		} else {
			System.out.println("Element Does not exist");
		}
	}

	public static int interpolation(int arr[], int l, int x) {
		int low = 0;
		int high = l - 1;

		while (low <= high && x >= arr[low] && x <= arr[high]) {
			int pos = low + ((high - low)/(arr[high]-arr[low])) * (x-arr[low]);
			
			if(arr[pos] == x)
				return pos;
			if(arr[pos]<x)
				low = pos +1;
			else
				high = pos -1;
		}
		return -1;

	}

}
