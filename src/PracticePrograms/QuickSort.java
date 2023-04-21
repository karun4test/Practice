package PracticePrograms;

public class QuickSort {

	public static void main(String[] args) {

		int[] array = { 6,2,8,7,6,5,4,3,2,1,2,3,45,8 };
		int n = array.length;
		
		System.out.println("given Array:");
		

		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println(" ");

		quickSort(array, 0, n - 1);

		System.out.println("Sorted Array:");

		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}

	}

	private static void quickSort(int[] array, int low, int high) {
		// TODO Auto-generated method stub
		if (low < high) {

			int pivotIndex = partition(array, low, high);

			quickSort(array, low, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, high);

		}

	}

	private static int partition(int[] array, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = array[high];

		int i = (low -1);

		for (int j = low; j <= high - 1; j++) {
			
			if (array[j] < pivot) {
				i++;
				swap(array, i, j);
			}

		}
		swap(array, i + 1, high);

		return (i + 1);
	}

	private static void swap(int[] array, int i, int j) {
		// TODO Auto-generated method stub

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
