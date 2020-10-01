// This program calculates the sum and average of age in an array and displays it

class Summerer {
	public static void main(String[] args) {
		int Ridwanjr[] = {21, 15, 16, 12, 82, 35, 3};
		
		int sum = 0;
		int Average = 0;
		
		for(int i = 0; i < Ridwanjr.length; i++) {
			sum = sum + Ridwanjr[i];
			
		}
		
		Average = sum/Ridwanjr.length;
		
		System.out.println("The total sum is: " + sum);
		System.out.println("The average age is: " + Average);
		
		System.out.println("These are the lists of ages: \n");
		System.out.println("Index(pos)\tValue(Age)");
		
		for(int y = 0; y < Ridwanjr.length; y++) {
			System.out.println(y + "\t\t" + Ridwanjr[y] );	
		}

	}
}
