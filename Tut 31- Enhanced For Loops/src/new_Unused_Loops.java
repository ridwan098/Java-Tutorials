class new_Unused_Loops {
	public static void main(String[] args) {
		
		int ridwan[] = {2, 3, 5, 6, 7, 8, 9, 0, 1};
		
		/**		This,
		for(int x = 0; x < ridwan.length; x++) {
			 ridwan[x] += 5;
			 System.out.println(ridwan[x]);
			 
		}	can be shortened, to:	*/
		
		for (int y : ridwan) {
			y += 5;
			System.out.println(y);
		}
		
	}
}
