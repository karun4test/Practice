package PracticePrograms;

public class SpacesInParagrap {
	
	public static void main(String[] args) {

		int result = paragraph();
		if (result == -1) {
			System.out.println("Enter correct sentense to identify spaces!!");
		} else if (result == 0) {
			System.out.println(
					"Its a single letter/started with space or only space ...Enter correct sentense to identify spaces!!");
		} else {
			System.out.println("Words in the sentense are :" + result);
		}

	}

	private static int paragraph() {

		String str = " ";
		char[] character = str.toCharArray();
		int counter = 0;

		int paragraphLength = str.length();
		//System.out.println("Length of String is : " + paragraphLength);

		int RightIndexOfParagraph = paragraphLength - 1;
		//System.out.println("RightIndexOfParagraph : " + RightIndexOfParagraph);

		if (paragraphLength <= 1) {
			return (paragraphLength - 1);
		}

		//if (character[0] == ' ') {
		if(str.charAt(0) ==' ') {
		return (0);
		}

		for (int i = 0; i < RightIndexOfParagraph; i++) {
			if (character[i] == ' ') {
				if (character[i + 1] == ' ') {
					System.out.println("Double space is there in Sentense ..please provide correct sentense! bye bye");
					return -1;
				}
				counter = counter + 1;

			}

		}
		return counter + 1;

	}

}
