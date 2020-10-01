// this tutorial is about enumeration
// enumeration are used to declare constants
// in this tutorial we print from a range of enumerations instead of the entire thing
import java.util.EnumSet; // need to import this to choose a range

public class apples {
	public static void main(String[] args) 
	{
		for(tuna people : tuna.values()) 
		{
			System.out.printf("%s\t%s\t%d\n", people, people.getDesc(), people.getAge());
		}
		
		System.out.println("\n -----------------------------------\n");

		System.out.println("And now for the range of constants");
		
		for(tuna people : EnumSet.range(tuna.cleo, tuna.nicole)) // allows youto choose a specific set
		{
			System.out.printf("%s\t%s\t%d\n", people, people.getDesc(), people.getAge());
		}
	}
}
//start from o45