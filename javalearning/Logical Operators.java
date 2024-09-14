package javalearning;

public class Exercises {

	public static void main(String[] args) {
		//Logical Operators
		boolean isHeWon = true;
		boolean isHeGood = false;
		boolean isHeAlive = true;
		System.out.println((!isHeWon || isHeGood) && isHeAlive);
	    System.out.println(!isHeWon);
	    String name = "Hasir";
	    System.out.println(17 < 12 || 25 < 35 && isHeGood || !isHeAlive && name.contains("H"));
	
	}

}
