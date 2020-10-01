//This program will use multiple methods and instance variables when using classes
// This program will output the name of our first girlfriend

public class Class1 {
	private String girlName;
	public void setName(String name) {
		girlName = name;
	}
	
	public String getName() {
		return girlName;
	}
	
	public void saying() {
		System.out.printf("You first girlfriend's name was %s", getName());
	}
}



// string is put next two public in the second method as it is its return type.
// This means that whatever will be returned will be a string.
// it will return a string.

// Private variables are accessible locally, meaning only the methods in this class,
//can access it.
