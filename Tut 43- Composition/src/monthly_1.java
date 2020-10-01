// composition is when a class has references to other
//objects for other classes.
// referring to objects from other classes as members
/** This works by referencing the borthday given in the
 * pot object, and then using it in another class, 
 * which is the tunaObject. this means that the birthday
 * is derived from another class**/
class monthly_1 {
	public static void main(String[] args) {
		
		monthly_3 potObject = new monthly_3(4, 11, 17);
		
		monthly_2 tunaObject = new monthly_2("Ridwan", potObject);
	
		System.out.println(tunaObject);
	}
}
