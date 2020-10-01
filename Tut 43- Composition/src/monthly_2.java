public class monthly_2 {
	private String name;
	private monthly_3 birthday;	/** this is a reference to an object 
	it will go to the toString Method in the next object */
	
	public monthly_2(String theName, monthly_3 theDate) {
		
		name = theName;
		birthday = theDate;
	}
	
	public String toString() {
		return String.format("My name is: %s My birthday is %s", name, birthday);
	}
}
