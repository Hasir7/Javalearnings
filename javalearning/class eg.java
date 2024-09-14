package javalearning;

import java.time.LocalDate;


public class Exercises16 {

	public static void main(String[] args) {
		Passport ukPassport = new Passport("12345", "UK", LocalDate.of(2029, 11, 25));
		Passport usPassport = new Passport("12345", "USA", LocalDate.of(2025, 9, 22));
	
		System.out.println("Passport 1");
		System.out.println("-----------");
		System.out.println("Passport No: " + ukPassport.number);
		System.out.println("Country: " + ukPassport.country);
		System.out.println("Expiry Date: " + ukPassport.expiryDate);
		
		System.out.println("Passport 2");
		System.out.println("-----------");
		
		System.out.println("Passport No: " + usPassport.number);
		System.out.println("Country: " + usPassport.country);
		System.out.println("Expiry Date: " + usPassport.expiryDate);
	}
	
	static class Passport {
		String number;
		String country;
		LocalDate expiryDate;
		
		Passport(String number, String country, LocalDate expiryDate) {
			this.number = number;
			this.country = country;
			this.expiryDate = expiryDate;
		
		
	}

}
}
