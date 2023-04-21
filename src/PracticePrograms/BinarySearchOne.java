package PracticePrograms;

public class BinarySearchOne {
	public static void main (String[] args) {
		int[] nums = {2,3,4,5,6,7,8,9};
		int first =0;
		int last = nums.length-1;
		int target = 2;
		int index = binarySearch(nums,first , last , target) ;
		
		if( index !=-1) {
			System.out.println("Target found at index:" + index);
		} else
			System.out.println("Target didnt find");
		
		}

	private static int binarySearch(int[] nums, int first, int last, int target) {
		// TODO Auto-generated method stub
		if ( first > last ) {
			return -1; 
		}
		 int mid = (first + last)/2;
		 
		 if (target == nums[mid]) {
			 return mid;
		 }
		 else if ( target > nums[mid]) {
			 return binarySearch(nums,mid+1,last , target);
		 }
		 else if ( target < nums[mid]) {
			 return binarySearch(nums,first,mid-1,target);
		 }
		
		return mid;
	}
	

}
