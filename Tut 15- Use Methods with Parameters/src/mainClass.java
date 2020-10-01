//this program takes in the user's name and prints it,
//by utilising the variables stored in another class

import java.util.Scanner;
	
class mainClass {
	public  static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);	//defining where user input will be stored
		Class2 newObject = new	Class2 ();	//defining the name of the object of the second class
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();	//taking the name variable from the other class
		//and then making it hold the user's input
		
		
		//in the class "newObject", find a method called "simpleMessage" and then 
		//display the name variable.
		newObject.simpleMessage(name);	//extracting the "simpleMessage" method 
		//from the other class.
	}
}
