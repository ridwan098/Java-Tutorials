// How to build a variable length argument list
// A method that takes however many arguments you want

class length_Arguments {
	public static void main(String[] args) {

		System.out.println(average(43, 44, 44, 53, 21));
	}
	
	public static int average(int...numbers) {//"..." means you dont know how many arguments
		
		int total = 0;
		for(int x:numbers) { // one line statements do not need curly braces, so you can remove it
			total += x;
		}
		return total/numbers.length;
				
	}
}


/**
for(int x:numbers)  // one line statements do not need curly braces, so you can remove it
total += x;

*/