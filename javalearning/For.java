package javalearning;

public class Exercises9 {

	public static void main(String[] args) {
		
		int [] numbers = {2, 5, 7, 9, 2, 4, 8, 4, 7, 2, 5};
		String [] names = {"Hasir", "Marya"};
		

		for(int i = 0; i< numbers.length; i++) {
			System.out.println(numbers[i]);
			
		}
		 
		System.out.println("==========================");
		 for(String name : names) {
			 System.out.println(name);
			 
		 }
		 
		 
		 System.out.println("==========================");
		 for(int i = numbers.length-1; i>=0; i--) {
				System.out.println(numbers[i]);
				
			}
		

}
}


