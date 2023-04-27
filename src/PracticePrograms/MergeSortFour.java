package PracticePrograms;
import PracticePrograms.Utility.PrintArray;

public class MergeSortFour {

	public static void main (String[] args) {
		
		//int[] array = {99,77,88,66,55,11,22,55,33,44};
		
		int[] array = {2,4,6,3,4,1};
		
		System.out.println("before:-");
		
		PrintArray.printArray(array);
		
		mergesort(array,0,array.length-1);
		
		System.out.println("After:-");
		
		PrintArray.printArray(array);
	}

	private static void mergesort(int[] array, int l, int r) {
		// TODO Auto-generated method stub
		
		if(l<r) 
		{
			int mid = l+(r-l)/2;
			
			mergesort(array,l,mid);
			mergesort(array,mid+1,r);
			
			mergearray(array,l,mid,r);
		}
		
	}

	private static void mergearray(int[] array, int l, int mid, int r) {
		// TODO Auto-generated method stub
		
		int n1 = mid- l+1;
		int n2 = r-mid;
		
		int L[] =  new int[n1];
		int R[] =  new int[n2];
		
		for(int i=0;i < n1;++i)
			L[i] = array[l+i];
		
		for ( int j=0;j < n2;++j)
			
			R[j] = array[mid+1+j];
		
		int i= 0,j=0; 
		int k =l;
		
		while (i < n1 && j < n2) {
			if(L[i] <= R[j]) {
				
				array[k]= L[i];
				i++;
			}
			else {
				
				array[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}
		while ( j < n2) {
			array[k]=R[j];
			j++;
			k++;
		}
		
	}
	
}
