package com.SortingAlgo;

public class InsertionSort {

	public static void main(String[] args) {
		int array[] = { 10, 3, 12, 45, 1, 34, 2 };
		int len = array.length;
		InsertionSort ins = new InsertionSort();
		ins.sort(array, len);
		ins.printArray(array, len);
	}

	public void printArray(int[] array, int len) {
		for (int i = 0; i < len; i++) {
			System.out.println(array[i] + " ");
		}
	}

	private void sort(int[] array, int len) {
		for (int i = 1; i < len; ++i) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

}
