// This program takes in the name of your first girlfriend,
// and prints it
import java.util.Scanner;

class Class1a {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Class1 girlObject = new Class1();
		
		System.out.println("Enter name of first gf here: ");
		String temp = input.nextLine();
		
		girlObject.setName(temp);
		girlObject.saying();
	}
}
