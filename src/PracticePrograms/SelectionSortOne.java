package PracticePrograms;

public class SelectionSortOne {

	public static void main(String[] args) {

		// int[] array = {11,22,55,33,44,66,111,77,222,88,99,1};
		int[] array = { 5, 6};
		System.out.println("array length :" + array.length);

		selectionSort(array);

		for (int i : array)
			System.out.print(i + " ");

	}

	private static void selectionSort(int[] array) {
		// TODO Auto-generated method stub

		for (int i = 0; i < array.length - 1; i++) {
			System.out.println("i =" + i);

			int min = i;

			System.out.println("min =" + min);

			for (int j = i; j < array.length; j++) {

				System.out.println("j =" + j);

				if (array[min] > array[j]) {

					min = j;
					System.out.println("min =" + min);
				}
			}

			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}

	}

}
