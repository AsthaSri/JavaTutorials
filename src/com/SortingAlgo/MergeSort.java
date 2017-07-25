package com.SortingAlgo;

public class MergeSort {

	public static void main(String[] args) {
		int array[] = { 10, 35, 12, 45, 1, 34, 2, 76, 3, 0, 23, 21 };
		int len = array.length;
		MergeSort ms = new MergeSort();
		InsertionSort ins = new InsertionSort();
		ms.sort(array, 0, len - 1);
		ins.printArray(array, len);
	}

	// l=first index of array
	// m=mid index of array
	// r=last index of array
	private void sort(int[] array, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			sort(array, l, m);
			sort(array, m + 1, r);

			// merging two array
			merge(array, l, m, r);
		}
	}

	private void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		// Dividing the array into two
		int subArray1[] = new int[n1];
		int subArray2[] = new int[n2];

		for (int i = 0; i < n1; i++)
			subArray1[i] = arr[l + i];

		for (int j = 0; j < n2; j++)
			subArray2[j] = arr[m + j + 1];

		// Merging the two array by sort the value
		int i = 0;
		int j = 0;
		int k = l;

		while (i < n1 && j < n2) {
			if (subArray1[i] <= subArray2[j]) {
				arr[k] = subArray1[i];
				i++;
			} else {
				arr[k] = subArray2[j];
				j++;
			}
			k++;
		}

		// Remaining elements
		while (i < n1) {
			arr[k] = subArray1[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = subArray2[j];
			j++;
			k++;
		}

	}

}
