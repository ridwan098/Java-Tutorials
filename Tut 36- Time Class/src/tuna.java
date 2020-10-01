// This is about the time class
// It will convert it to military time
class tuna {
	public static void main(String[] args) {
		second_Class ridObject = new second_Class();		
		System.out.println(ridObject.toMilitary());
		
		ridObject.setTime(13, 27, 6);	//sets the time
		System.out.println(ridObject.toMilitary());		
	}
}
