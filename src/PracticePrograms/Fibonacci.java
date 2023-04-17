package PracticePrograms;

public class Fibonacci {
	
	public static void main (String[] args)
	{
		int[] arr = new int[100];
		
		int firstElement = 0; 
		int secondElement = 1; 
	    int  thirdElement=1;
		
		for (int i=0; i<40;i++) {
			
			arr[i] = firstElement; 
			arr[i+1]=secondElement;
			arr[i+2]= thirdElement;
			
			firstElement = secondElement;
			secondElement = thirdElement; 
			thirdElement = firstElement+secondElement;
			
			
		}
		
		for(int i=0;i<42;i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
	}

}
