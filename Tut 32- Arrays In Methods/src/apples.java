// How to pass arrays into methods

class apples {
	public static void main(String[] args) {
		
		int ridwan[] = {3, 3, 4, 5, 6, 7, 8, 9, 1, 2};
		
		change(ridwan); /** this will then change the arrays through the change 
		method we created below */
		
		for(int i:ridwan) { // for each item in the array,
			System.out.println(i);	// print it., as "i" stores the value for each of them 
			// they should change as we added five to them
		}
	}
	
					/** this variable would take a parameter of one array.
	which is why we are using an empty square bracket */
	public static void change(int x[]) {/** this is a separate method to the above
		and would not run first as it is not a "main"	*/
		
		for(int counter = 0; counter < x.length; counter++) {
			x[counter] += 5;
		}
				
	}
}
