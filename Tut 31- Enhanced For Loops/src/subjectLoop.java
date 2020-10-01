class subjectLoop {
	public static void main(String[] args) {
		
		int ridwan[] = {2, 3, 4, 5, 6, 7, 8, 11};
		int total = 0;
		
		String shoppingList[] = {"Apple", "Tuna", "Milk"};
		
		
		/** the first argument it takes is the type and identifier, which is what value
		you want to store the array variables in. And then the array you want to 
		loop through*/	
		
		/**this for statement is specialised to loop through all of 
		the elements in your array  */
		
		for(int x: ridwan) {	// x is stores the value of each of the items in the list
			 total += x;			 
		}
		
		System.out.println(total); 
		
		for(String item: shoppingList) {
			System.out.println(item);
		}
	}
}
