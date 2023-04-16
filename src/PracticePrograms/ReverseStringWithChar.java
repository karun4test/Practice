package PracticePrograms;

public class ReverseStringWithChar {
	
	public static void main (String[] args) {
		
		String str = "Geek";
		
		char[] temparray = str.toCharArray();
		
		int left, right =0;
	
		right = str.length()-1;
		System.out.println("String length :"+ str.length());
		System.out.println("Char array length :"+ temparray.length);
		
		
		for ( left = 0; left < right ; left ++ , right --) {
			
			char ch = temparray[left];
			
			temparray[left] = temparray[right];
			
			temparray[right]= ch;
			
		}
		
		for (char c:temparray) 
			System.out.print(c);
		System.out.println(str);
			
			
		
		
	}

}
