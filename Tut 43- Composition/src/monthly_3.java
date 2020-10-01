public class monthly_3 {
	private int month;
	private int day;
	private int year;
	

	public monthly_3(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for this is %s\n", this);
	
	}

	public String toString() {
		return String.format("%s/%d/%d", day, month, year);
	}
	
}