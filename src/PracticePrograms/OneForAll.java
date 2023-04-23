package PracticePrograms;

import PracticePrograms.Utility.PrintArray;

public class OneForAll {

	public static void main(String[] args) {
		int[] array = { 6, 4, 8, 2, 9, 2 };
		int n = array.length;
		
		System.out.println("\nBefore sort Array:");
		PrintArray.printArray(array);

		//beforeSortArray(array);

		 selectionSort(array);
		 
		 System.out.println("\nAfter sort Array:");

		//quickSort(array, 0, n - 1);
		 PrintArray.printArray(array);

		//AfterSortArray(array);

	}

//	private static void AfterSortArray(int[] array) {
//		// TODO Auto-generated method stub
//
//		System.out.println(" " + '\n');
//		System.out.println(" Print array after sorting :");
//		for (int i = 0; i <= array.length - 1; i++)
//			System.out.print(array[i] + " ");
//		System.out.print(" ");
//	}

//	private static void beforeSortArray(int[] array) {
//		// TODO Auto-generated method stub
//		System.out.println(" " + '\n');
//		System.out.println(" Given unsorted array :");
//		for (int i = 0; i <= array.length - 1; i++)
//			System.out.print(array[i] + " ");
//		System.out.print(" ");
//
//	}

	private static void quickSort(int[] array, int low, int high) {
		// TODO Auto-generated method stub

		if (low < high) {

			int pivoteIndex = partition(array, low, high);

			quickSort(array, low, pivoteIndex - 1);
			quickSort(array, pivoteIndex + 1, high);

		}
	}

	private static int partition(int[] array, int low, int high) {
		// TODO Auto-generated method stub
		int i = (low - 1);
		int pivote = array[high];

		for (int j = low; j <= high - 1; j++) {
			if (array[j] < pivote) {
				i++;
				swap(array, i, j);
			}

		}
		swap(array, i+1, high);
		return (i+1);
	}

	private static void selectionSort(int[] array) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= array.length - 1; i++) {
			int min = i;
			for (int j = i; j <= array.length - 1; j++) {
				if (array[min] > array[j]) {
					min = j;
				}

			}
			swap(array, min, i);

		}

	}

	public static void swap(int[] array, int i, int j) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}
}
