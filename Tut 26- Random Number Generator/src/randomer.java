import java.util.Random;

class randomer {
	public static void main(String[] args) {
		Random dice = new Random();
		int number;
		
		for (int counter = 1; counter <= 10; counter++) {
			number = 1+dice.nextInt(6);/* would be 0 to 5,
			but the +1 makes it 1 to 6 */
			System.out.println(number + " ");
		}
	}
}

// To use Random, first you have to import it
