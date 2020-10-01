public class effectively_3 {
	private int month;
	private int day;
	private int year;
	
	public effectively_3(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for this is %s\n", this);	/**
		"this" is a reference to the object we just built whenever we call this class
		
		we said that we needed a string through the "%s" in the printf, with the "this"
		looking for the	string
		
		as there are no strings specified, java made  a String representation, which 
		is called toString.
		
		Any time "this" is now looking for a string, it looks for the "toString" Method
		*/		
	}
	
	public String toString() {// toString method is a String representation of an object
		return String.format("%s/%d/%d", day, month, year);
	}
	
}
