package PracticePrograms;

import PracticePrograms.Utility.PrintArray;
import PracticePrograms.Utility.SwapingNumbers;

public class TrailPrac {
	
	// SelectionSort : 
	
	// loop i and loop J and min = i and compare next element is smaller than min if small change min to j and end of the loop swap the MIN and I
	
	public static void main (String[] args) {
		int[] array = {2,3,6,1,2,8,9,4};
		
		System.out.println("\nBefore sort Array:\n");
		PrintArray.printArray(array);
		
		selectionSort(array);
		//Call To selectionSort
		
		System.out.println("\nAfter sort Array:");
		
		PrintArray.printArray(array);
	}

	private static void selectionSort(int[] array) {
		// TODO Auto-generated method stub
		
		//initiate for loop for array from index 0 to length-1
		
		for ( int i =0 ; i<=array.length-1;i++) {
		
			//	sorting algorithm is first element in array is minimum element , so assume first element is Min or first index of array has Min value 
			
			int min = i;
			 for ( int j = i ; j <= array.length-1; j++) {
				 
				 // compare all elements with first( min)  element if next element is minimum element , replace as minimum 
				 
				 if ( array[j] < array[min]) {
					 min = j;
					 
				 }
				 
			 }
			 
			 //Now after entire loop swap to first element to minimum element
			 
			 SwapingNumbers.swap(array,i,min);
		}
		
		
	}

}
