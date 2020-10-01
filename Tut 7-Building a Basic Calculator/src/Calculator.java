import java.util.Scanner;

class  Calculator {
	public static void main(String args[]){
		Scanner ridwan = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: ");
		fnum = ridwan.nextDouble();
		System.out.println("Enter second num: ");
		snum = ridwan.nextDouble();
		answer = fnum + snum;
		System.out.println("The sum was: " + answer);
	}
	
}

/**
 * in the previous tutorial, we used ridwan.nextLine. 
 * this was because we were dealing with text. However,
 * since we are dealing with double here, we would use 
 * nextDouble
 */
