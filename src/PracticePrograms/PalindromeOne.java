package PracticePrograms;

public class PalindromeOne {
	
	public static void main (String[] args) {
		String str = "ABCDEdcba";
		str = str.toLowerCase();
		System.out.println(str);
		
		 boolean flag = true;
		 char[] chararr = str.toCharArray();
		 int length = str.length() -1;
		 
		 for(int i=0;i<=length;i++,length--) {
			 if(chararr[i]!=chararr[length]) {
				 flag = false;
				 System.out.println("failed at position of string :" + i );
				 break;
				 
			 }
		 }
		 
		 
		 if(flag ==true)
			 System.out.println("Given string is palindrom");
		 else 
			 System.out.println("Given string is NOT palindrom");
			 
		 
	}

}
