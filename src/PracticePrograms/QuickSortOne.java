package PracticePrograms;

public class QuickSortOne {

	public static void main(String[] args) {
		int[] array = { 4, 7, 1, 2, 8, 9, 0, 3 };
		int n = array.length;
		quickSort(array, 0, n - 1);

		for (int i : array) {
			System.out.print(i + " ");

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
		int i = low - 1;
		int pivot = array[high];

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
