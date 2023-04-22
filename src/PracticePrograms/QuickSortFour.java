package PracticePrograms;

public class QuickSortFour {
	
	public static void main (String[] args) {
		int[] array  = {4,1,6,8,2};
		int n = array.length;
		
		quickSort( array , 0 , n-1);
		
		for ( int i : array ) {
			System.out.print(i + " ");
			
		}
		
	}
	 private static void quickSort (int[] array , int low , int high ) {
		 
		  if( low < high) {
		 int pivoteIndex = partition( array , low , high);
		  
		  quickSort(array,low,pivoteIndex-1);
		  quickSort (array,pivoteIndex+1,high);
		  
	 }
	 }
	private static int partition(int[] array, int low, int high) {
		// TODO Auto-generated method stub
		int i = low -1; 
		int pivote = array[high];
		
		for ( int j = low ; j<= high-1; j++) {
			if(array[j]< pivote) {
				i++;
				swap(array, i , j);
			}
			
			
		}
		
		swap( array , i+1, high);
		return(i+1);
	}
	private static void swap(int[] array, int i, int j) {
		// TODO Auto-generated method stub
		
		int temp = array[i];
		array[i] = array [j];
		array[j] = temp;
	}

}
