// This program takes 10 numbers and then calculates the average

import java.util.Scanner;

class Average {
	public static void main(String[] args) {
		
		Scanner ridwan = new Scanner(System.in);
		int total = 0;
		int grade, average, counter;
		counter = 0;
		
		System.out.println("Enter 10 numbers and press enter after each one:");
		
		while (counter < 10) {
			grade = ridwan.nextInt();
			total = total + grade;
			counter ++;
		}
		
		average = total/10;
		System.out.println("Your average is: " + average);
	}
}
