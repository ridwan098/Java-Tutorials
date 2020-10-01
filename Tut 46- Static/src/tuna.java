// Static keyword means every object shares the same variable

public class tuna {
	private String first;
	private String last;
	private static int members = 0;
	
	public tuna(String fn, String sn) 
	{
		first = fn;
		last = sn;
		members++;
		System.out.printf("Constructor for %s %s, members in the club: %d\n", first, last, members);
	}
}
