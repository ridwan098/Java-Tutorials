// This program takes array elements as counters
// it will work with a random number 
import java.util.Random;

class array_Element {
	public static void main(String[] args) {
		Random rand = new Random();
		int freq[] = new int[7]; //this is 7 because there are six sides to a dice. it starts from 0
		// the above is also saying that there will be seven values stored in the array. 0-6 indexes
		
		
		for(int roll = 1; roll <= 1000; roll++) {
			++freq[1+rand.nextInt(6)];	//for each time you land on any of the indexes, tick it plus 1.
			/** The bit inside the square brackets is just making sure that the random number generated 
			is between 1 and 6. Look at Tut 26 if stuck. */
		}
		
		System.out.println("Face\tFrequency");
		
		for(int face = 1; face < freq.length; face++) {
			System.out.println(face + "\t" + freq[face]);// this just displays the amount each of the 
			//indexes has been ticked
			// They should all equal a thousand
		}
		
		System.out.println("The most likely number is: " + Math.max(freq[1],freq[2]));/**
		broken, should work out the most likely to roll */
	}
}
