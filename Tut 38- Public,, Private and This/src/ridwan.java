/** How to Control Access to variables in other classes
and the meaning of the "THIS" keyword in java	*/
// **WARNING** "This" explanation is quite wrong
class ridwan {
	public static void main(String[] args) {
		ishola ridObject = new ishola();		
		
		System.out.println(ridObject.toMilitary());	//default time		
		System.out.println(ridObject.toString()); //default time
		
		ridObject.setTime(13, 27, 6);	//Set time
		
		System.out.println(ridObject.toMilitary());	
		System.out.println(ridObject.toString());
		
		
	}
}
