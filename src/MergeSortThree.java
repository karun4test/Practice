import PracticePrograms.Utility.PrintArray;

public class MergeSortThree {
	
	public static void main (String[] args) {
		
		int[] array = { 9,3,4,6,1,2,3,9,0};
		
		PrintArray.printArray(array);
		
		mergeSort(array,0,array.length-1);
		
		PrintArray.printArray(array);
		
		
	}

	private static void mergeSort(int[] array, int l, int r) {
		// TODO Auto-generated method stub
		
		if ( l < r) {
			int mid = (l+r)/2; 
			
			mergeSort(array,l,mid);
			mergeSort(array,mid+1,r);
			
			mergeArray(array,l,mid,r);
		}
		
		
	}

	private static void mergeArray(int[] array, int l, int mid, int r) {
		// TODO Auto-generated method stub
		
		int n1 = mid -l+1;
		int n2 = r - mid;
		
	    int L[] = new int[n1];
	    int R[] = new int[n2];
	    
	    for ( int i=0; i<n1; ++i)
             L[i] = array[l+1];
	    for ( int j=0; j<n2;++j)
	    	R[j] = array[r-mid+1];
	    
	    int i =0 ,j=0; 
	    int k = l;
	    
	    while ( i <n1 && j < n2) {
	    	if( L[i] <= R[j]) {
	    		i++;
	    		array[k] = L[i];
	    		
	    	} 
	    	else {
	    		j++;
	    		array[k]= R[j];
	    		
	    	}
	    	
	    	k++;
	    }
	    
	    while ( i < n1) {
	    	array[k] = L[i];
	    	i++;
	    	k++;
	    }
	    while ( j < n2) {
	    	array[k] = R[j];
	    	j++;
	    	k++;
	    }
	    	
	}
	
	

}
