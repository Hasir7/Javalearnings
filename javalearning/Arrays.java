package javalearning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercises6 {

	public static void main(String[] args) {
		//Arrays
		
		int [] numbers = {2, 0, 1, 5, 7, 8, 2, 6};
		
		String [] names = {"Hasir", "Marya"};
		
		/*int [] numbers = new int[10];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 1;
		numbers[4] = 1;
		numbers[5] = 1;
		numbers[6] = 1;
		numbers[7] = 1;
		numbers[8] = 1;
		numbers[9] = 1;*/
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers.length);
		
		System.out.println(Arrays.toString(names));
		System.out.println(names.length);

	}

}
