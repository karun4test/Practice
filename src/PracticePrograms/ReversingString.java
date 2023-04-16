package PracticePrograms;

public class ReversingString {
	public static void main (String[] args) {
		String str = "Bakki karuna kumar", newstr = " ";
		char ch;
		
		System.out.println("Given String :" + str);
		
		System.out.println("String length is :" + str.length());
		
		for (int i=0; i< str.length();i++) {
			
			ch = str.charAt(i);
			newstr = ch + newstr;
			
		}
		System.out.println("New string :" + newstr);
		
	}

}
