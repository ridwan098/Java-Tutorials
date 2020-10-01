// start from 35 

public enum orange
{
	bucky("is nice", "23"), 
	ridwan("funny", "18"),
	michael("Nice", "55");
	
	private final String feature;
	private final String age;
	
	//image this constructor as one of the ranges
	//that way, you can see how it knows how to get each of
	//the values. Because that way, you can see that 
	// the first parameter it takes is quality and the 
	//first paramater in each of the people is also 
	//quality. and the next is age. the variables
	//are then used so that we can reference each of these
	//paramaters
	orange(String quality, String DOB)
	{
		feature = quality;
		age = DOB;
	}
	
	public String getDesc() 
	{
		return feature;
	}
	
	public String getAge() 
	{
		return age;
	}
}

