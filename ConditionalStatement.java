package oopConcepts;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		boolean condition1 = 10 == 20;
		System.out.println("conditiona1: " + condition1);
		
		boolean condition2 = 30 == 30;
		System.out.println("conditiona2: " + condition2);
		
		int val3 = 10;
		int val4 = 20;
		boolean condition3 = val3 == val4;
		System.out.println("conditiona3: " + condition3);
	
		if (val3 < val4) {
			System.out.println("Yes, true");
		}
	
		int val5 = 50;
		int val6 = 60;
		if (val5 < val6) {
			System.out.println("yes, true");
		}
		
		int score = 81; 			// controlling variable
		String grade;
		
		if (score > 90) {
			grade = "A";
		} 
		else if (score > 80) { 		// since condition was true above, it wont hit this block or next block
			grade = "B";
		} 
		else {
			grade ="C";
		}
		
		System.out.println("Score is: " + score);
		System.out.println("Grade is: " + grade);
	}
}

