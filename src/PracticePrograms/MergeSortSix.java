package PracticePrograms;

import PracticePrograms.Utility.PrintArray;

public class MergeSortSix {
	
	public static void main ( String[] args) {
		int[] array = {23,34,45,56,67,78,87,76,65,56,54,34,33};
		PrintArray.printArray(array);
		mergeSort (array, 0, array.length-1);
		
		PrintArray.printArray(array);
	}

	private static void mergeSort(int[] array, int l, int r) {
		// TODO Auto-generated method stub
		
		int mid = (l+r)/2;
		if(l<r) {
			mergeSort(array,l,mid);
			mergeSort(array,mid+1,r);
			
			mergeArray(array,l,mid,r);
			
		}
		
	}

	private static void mergeArray(int[] array, int l, int mid, int r) {
		// TODO Auto-generated method stub
		
		int n1 = (mid-l)+1;
		int n2 = r-mid;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		
		for ( int i=0;i<n1;++i)
			L[i] = array[l+i];
		     
		for(int j=0 ; j<n2;++j)
			R[j] = array[mid+1+j];
		
		int i=0,j=0;
		int k=l;
		
		while ( i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				array[k]=L[i];
				i++;
			} 
			else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		while ( i<n1) {
			array[k] = L[i];
			i++;
			k++;
		}
		while ( j<n2){
			array[k] = R[j];
			j++;
			k++;
		}
		
		
			
		
	}
	
	

}
