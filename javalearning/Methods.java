package javalearning;

import java.util.Arrays;

public class Exercises14 {

	public static void main(String[] args) {
		// Methods
      char [] letters = {'A', 'A', 'D', 'D', 'Y', 'H', 'N', 'N'};
      String [] names = {"Hasir", "Marya"};
      int count = countAlphabets(letters, names, 'K', "Hasir");
      System.out.println(count);
	}
      public static int countAlphabets(char [] letters, String [] names, char searchLetters, String searchNames) {
    	System.out.println(Arrays.toString(letters));
    	System.out.println(Arrays.toString(names).toUpperCase());
    	System.out.println(searchLetters);
    	System.out.println(searchNames.toUpperCase());
    	int count = 0;
    	for (char letter : letters) {
      if (letter == searchLetters) {
    	  
      
      count++;
      }
    	}
    	return count;
}
}