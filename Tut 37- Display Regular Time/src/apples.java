// This is about the time class
// It will convert it to regular and normal time
class apples {
	public static void main(String[] args) {
		second_Class ridObject = new second_Class();		
		
		System.out.println(ridObject.toMilitary());	//default time		
		System.out.println(ridObject.toString()); //default time
		
		ridObject.setTime(13, 27, 6);	//Set time
		
		System.out.println(ridObject.toMilitary());	
		System.out.println(ridObject.toString());
		
		
	}
}
