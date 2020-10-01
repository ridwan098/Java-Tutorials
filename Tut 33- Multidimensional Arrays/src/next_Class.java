//Tut 34
// How to create a visual table for the multi-dimensional array

class next_Class {
	public static void main(String[] args) {
		
		int first_Array[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}}; 
		int second_Array[][] = {{30, 31, 32, 33}, {43}, {11, 12, 13, 14, 15}};
	
		System.out.println("This is the First Array");
		display(first_Array);
		
		System.out.println("This is the Second Array");
		display(second_Array);
	}
	
	public static void display(int x[][]) {
		for(int row = 0; row < x.length; row++) {//this bit checks the main curly braces
			for(int column = 0; column < x[row].length; column++) {//this bit checks the inner curly braces
				System.out.print(x[row][column] + "\t");/** We use print as we 
				dont want each column to be printed on a new row 
				This works by taking the index of row and column and then 
				displays them*/ 
			}
			System.out.println();	//This just makes a new line to separate it
		}
	}
}
