package com.SearchingAlgo;

public class JumpSearch {

	public static void main(String[] args) {

		int arr[] = {10,20,30,40,50,60,70,80,90};
		int x = 90;
		int index = jump(arr,x);
		index++;
		System.out.println("Element " + x + " found at " + index);
	}
	
	public static int jump(int arr[],int x){
		int len = arr.length;
		int step = (int)Math.floor(Math.sqrt(len));
		int prev = 0;
		while((arr[Math.min(step, len)-1]) < x){
			prev = step;
			step += (int) Math.floor(Math.sqrt(len));
			if(prev >= len)
				return -1;
		}
		
		while(arr[prev]<x){
			prev++;
			if(prev == Math.min(step, len))
				return -1;
		}
		
		if(arr[prev] == x)
			return prev;
		
	return -1;
	}

}
