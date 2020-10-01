
public enum tuna {
	ridwan("Sexy", 19), 
	cleo("pregnant", 21),
	jade("prude", 21),
	nicole("italian", 13),
	candy("different", 14),
	erin("iwish", 16);
	
	private final String desc;
	private final int age;
	
	tuna(String description, int num)
	{
		desc = description;
		age = num;
	}
	
	public String getDesc() 
	{
		return desc;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	
}

