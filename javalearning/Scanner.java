package javalearning;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercises13 {

	public static void main(String[] args) {
		// Scanner
		Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name ?");
		String userName = scanner.nextLine();
		System.out.println("Welcome " + userName);
		
		System.out.println("What is your Age?");
		int age = scanner.nextInt();
		
		int year = LocalDate.now().minusYears(age).getYear();
		
		System.out.println("You were born on " + year);
	
	    if (age > 18) {
	    	System.out.println("You are an adult");
	    } else {
	    	System.out.println("You are not an adult");	
	    	}
	   } 
	
	}


