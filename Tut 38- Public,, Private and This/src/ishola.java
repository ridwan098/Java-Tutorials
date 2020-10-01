public class ishola {
	private int hour = 1;		//private means that the local methods have access to them
	private int minute = 2;		//	they cannot be used in another class
	private int second = 3;
	
	public void setTime(int h, int m, int s) {
		this.hour = 4;		// tells it to refer to the instant variable **right**
		this.minute = 5;	// 
		this.second = 6;
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", hour, minute, second );
	}			//displays in 2 decimal places
	
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, (hour < 12? "AM": "PM"));
	}
}

//
