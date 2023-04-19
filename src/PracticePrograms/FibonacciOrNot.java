package PracticePrograms;

public class FibonacciOrNot {
	public static void main(String[] args) {

		int number = 3;
		int s, o;
		System.out.println(" ----------for debug---------");
		
		int test1 = (5 * number * number + 4);
		System.out.println(" Test1 vaue -" + test1);
		int test2 = (5 * number * number - 4);
		System.out.println(" Test2 value -" + test2);

		s = (int) Math.sqrt(test1);
		System.out.println(" s value -" + s);
		o = (int) Math.sqrt(test2);
		System.out.println(" o value  - " + test1);
		System.out.println(" ----------for debug---------");
		
		if (s * s == test1 || o * o == test2)
			System.out.println(" Given number is Finbonacci number :" + number);
		else
			System.out.println(" Given number is not Finbonacci number :" + number);

	}
}
