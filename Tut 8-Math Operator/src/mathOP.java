import java.util.Scanner;

class mathOP {
	public static void main(String args[]) {
		Scanner ridwan = new Scanner(System.in);
		
		int girls, boys, people;
		
		girls = 11;
		boys= 3;
		people = girls % boys;
		
		System.out.println(people);
	}

}

/**
* the math operations include: +, -, *, / and %, which is the modulus operator
* however, when you divide and have a remainder in 
* whilst using, the int data type, you will only get the
* whole number and not the the remainder or decimal 
* places
* 
* THE MODULUS OPERATOR IS THE REMAINDER
*/