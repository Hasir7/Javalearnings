package javalearning;

public class Exercises5 {

	public static void main(String[] args) {
	//Switch Statement
		
		String gender = "FEMAL";
		
		switch (gender) {
		case "FEMALE" :
			System.out.println("I am a female");
			break;
		case "MALE":
			System.out.println("I am a male");
		break;
		case "PREFER NOT TO SAY":
			System.out.println("Prefer not to say");
			break;
		default:
			System.out.println("I dont identity gender");
		
		}

	}

}
