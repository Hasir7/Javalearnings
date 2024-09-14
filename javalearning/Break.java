package javalearning;



public class Exercises10 {

	public static void main(String[] args) {
		
		//Break
		
		String [] names = {"Zayn Malik", "Marya", "Hasir", "Sarah"};
		for (String name : names) {
			if(name.startsWith("H")) {
				continue;
			}
			System.out.println(name);
	}
		
	}
}