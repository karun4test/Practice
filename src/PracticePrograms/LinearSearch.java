package PracticePrograms;

public class LinearSearch {
	
	public static void main ( String[] args) {
		int[] nums= {2,3,4,5,6,7,8,9,11,12,13,15};
		int target = 153; 
		int length = nums.length -1; 
		int index = linearSearch(nums, target, length);
		
		if (index!=-1) {
			System.out.println(" Target found at index :" + index);
		} else
			System.out.println("Target didnt found in array");
	}
	public static int linearSearch(int[] nums, int target , int length) {
		
		 for ( int i=0 ; i<= length;i++)
		 {
			 if(target == nums[i]) {
				 return i;
			 } 
		 } 
		
		return -1;
	}

}
