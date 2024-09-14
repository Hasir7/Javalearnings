package javalearning;

public class Exercises4 {

	public static void main(String[] args) {
		
		//If statement
		
		int age = 18;
		if (age < 17) {
			System.out.println("I am not an adult");
		}
			else if (age > 15 && age <= 17 || age <=17) {
				System.out.println("I am an adult");
			}
			else if (age <=17) {
				System.out.println("Likely an adult");
			}
			else {
				System.out.println("False");
			}
	}

}
