package PracticePrograms;

public class Palindrom {
	
	public static void main (String[] arg) {
		
		String str = "radar is a si Radar";
	    str = str.toLowerCase();
	    
	    System.out.println(str);
	    
	    boolean flag = true;
		
	    char[] chararr = str.toCharArray();
		int length = str.length()-1 ;
		
		
		for(int i=0;i <=length;i++,length --)
		{
		
		if(chararr[i] != chararr[length]) {
			
			flag = false;
			break;
	
		}
		}
			if ( flag == true ) {
				System.out.println("Given string is palindrom");
			} else 
				System.out.println(" given string is not palindrom");
		
		
	}

}
