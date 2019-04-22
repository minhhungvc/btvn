package buoi4;

public class bt1 {
public static void main (String []agrs) {
	char grade ='C';
	switch (grade) {
	case 'A':
		System.out.println("Excellent :");
		break;
	case 'B':
	case 'C':
		System.out.println("Well done :");
		break;
	case 'D':
		System.out.println("You passed :");
	case 'F':
		System.out.println("Better try again :");
		break;
	default:
		System.out.println("Invalid  grade :");
		
	
	}
	System.out.println(" Your grade is :" + grade);
}
}
