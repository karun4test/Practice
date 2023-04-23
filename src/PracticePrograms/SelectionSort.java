package PracticePrograms;

public class SelectionSort {
	public static void main(String[] args) {

		//int[] arr = { 32, 21, 23, 34, 45, 56, 67, 78, 89, 97, 24 }; {11,22,55,33,44,66,111,77,222,88,99,1}

		int[] arr = { 5,4,6,3,7}; 
		selectionSort(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			int min = i;

			for (int j = i; j < arr.length; j++) {

				if (arr[min] > arr[j]) {
					min = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

		}

	}

}
