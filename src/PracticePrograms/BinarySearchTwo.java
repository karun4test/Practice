package PracticePrograms;

public class BinarySearchTwo {
	
//	public static void main ( String[] args) {
//		int[] nums = {2,3,4,5,6,7,8,9,11,12,13,14,15};
//		int first = 0; 
//		int last = nums.length -1; 
//		int target = 11;
//		
//		int index = binarySearch(nums,first , last , target) ; 
//		
//		if ( index != -1 ) {
//			System.out.println("Target Found at index:" + index );
//		} else 
//			System.out.println("Target didnt found in the array");
//	}
//	
//	private static int binarySearch(int[] nums, int first , int last , int target) {
//		
//		if ( first > last ) {
//			return -1;
//		}
//		
//		int mid = ( first +  last )/2;
//		
//		if ( target == nums[mid]) {
//			return mid;
//			
//		} else if ( target > nums[mid]) {
//			return binarySearch ( nums,mid+1 , last, target);
//		}
//		else if ( target < nums[mid]) {
//			return binarySearch(nums,first, mid-1, target);
//		}
//		
//		
//		return mid;
//		
//	}
	
	public static void main (String[] args) {
		
		int[] array = {12,23,34,45,56,67,78,1,2,3,4,5,1111,2222,3333};
		
		System.out.println(" ---- Before sorting the array --- ");
		for (int i:array)
			System.out.print(i + " ");
		    System.out.println(" ");
		    System.out.println(" ");
		
		SelectionSort Sort = new SelectionSort();
		Sort.selectionSort(array);
		
		System.out.println(" ---- After calling sort method form Other class  and sorting the array --- ");
		for (int i:array)
			System.out.print(i + " ");
		     System.out.println(" ");
		     System.out.println(" ");
		
		int first =0; 
		int last = array.length-1;
		int target = 1;
		
		
		int index = binarySearch(array,first, last , target);
		
		if ( index != -1) 
			System.out.println("Target found at index:"  + index);
		else 
			System.out.println("target didnt find");
		
		
		
	}

private static int binarySearch(int[] array, int first, int last, int target) {
	// TODO Auto-generated method stub
	
	if ( first > last) {
		return -1;
	}
	
	
	int mid = (first+last)/2;
	
	
	
	if ( target == array[mid] ) {
		return mid;
	} 
	else if ( target > array[mid] ) {
		
		return binarySearch(array,mid+1,last , target);
		
	} else if ( target < array[mid] ) {
		return binarySearch ( array, first, mid-1, target);
	}
		
	
	
	return 0;
}
	

}
